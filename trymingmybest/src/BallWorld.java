import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BallWorld extends JPanel {
    public class Ball {
   ......
           ......
        // Working copy for computing response in intersect(Ball, timeLimit),
        // to avoid repeatedly allocating objects.
        private CollisionResponse thisResponse = new CollisionResponse();
        private CollisionResponse anotherResponse = new CollisionResponse();

        /**
         * Check if this ball collides with the given another ball in the interval
         * (0, timeLimit].
         */
        public void intersect(Ball another, float timeLimit) {
            // Call movingPointIntersectsMovingPoint() with timeLimit.
            // Use thisResponse and anotherResponse, as the working copies, to store the
            // responses of this ball and another ball, respectively.
            // Check if this collision is the earliest collision, and update the ball's
            // earliestCollisionResponse accordingly.
            CollisionPhysics.pointIntersectsMovingPoint(
                    this.x, this.y, this.speedX, this.speedY, this.radius,
                    another.x, another.y, another.speedX, another.speedY, another.radius,
                    timeLimit, thisResponse, anotherResponse);

            if (anotherResponse.t < another.earliestCollisionResponse.t) {
                another.earliestCollisionResponse.copy(anotherResponse);
            }
            if (thisResponse.t < this.earliestCollisionResponse.t) {
                this.earliestCollisionResponse.copy(thisResponse);
            }
        }
    }
    // Balls
    private static final int MAX_BALLS = 25; // Max number allowed
    private int currentNumBalls;             // Number currently active
    private Ball[] balls = new Ball[MAX_BALLS];

    /** Constructor to create the UI components and init the game objects. */
    public BallWorld() {
      ......
      ......

        currentNumBalls = 11;
        balls[0] = new Ball(100, 410, 25, 3, 34, Color.YELLOW);
        balls[1] = new Ball(80, 350, 25, 2, -114, Color.YELLOW);
        balls[2] = new Ball(530, 400, 30, 3, 14, Color.GREEN);
        balls[3] = new Ball(400, 400, 30, 3, 14, Color.GREEN);
        balls[4] = new Ball(400, 50, 35, 1, -47, Color.PINK);
        balls[5] = new Ball(480, 320, 35, 4, 47, Color.PINK);
        balls[6] = new Ball(80, 150, 40, 1, -114, Color.ORANGE);
        balls[7] = new Ball(100, 240, 40, 2, 60, Color.ORANGE);
        balls[8] = new Ball(250, 400, 50, 3, -42, Color.BLUE);
        balls[9] = new Ball(200, 80, 70, 6, -84, Color.CYAN);
        balls[10] = new Ball(500, 170, 90, 6, -42, Color.MAGENTA);

        // The rest of the balls, that can be launched using the launch button
        for (int i = currentNumBalls; i < MAX_BALLS; ++i) {
            balls[i] = new Ball(20, CANVAS_HEIGHT - 20, 15, 5, 45, Color.RED);
        }
      ......
    }

    /** Update the game objects, detect collision and provide response. */
    public void gameUpdate() {
        float timeLeft = 1.0f;  // One time-step to begin with

        // Repeat until the one time-step is up
        do {
            // Find the earliest collision up to timeLeft among all objects
            float tMin = timeLeft;

            // Check collision between two balls
            for (int i = 0; i < currentNumBalls; ++i) {
                for (int j = 0; j < currentNumBalls; ++j) {
                    if (i < j) {
                        balls[i].intersect(balls[j], tMin);
                        if (balls[i].earliestCollisionResponse.t < tMin) {
                            tMin = balls[i].earliestCollisionResponse.t;
                        }
                    }
                }
            }
            // Check collision between the balls and the box
            for (int i = 0; i < currentNumBalls; ++i) {
                balls[i].intersect(box, tMin);
                if (balls[i].earliestCollisionResponse.t < tMin) {
                    tMin = balls[i].earliestCollisionResponse.t;
                }
            }

            // Update all the balls up to the detected earliest collision time tMin,
            // or timeLeft if there is no collision.
            for (int i = 0; i < currentNumBalls; ++i) {
                balls[i].update(tMin);
            }

            timeLeft -= tMin;                // Subtract the time consumed and repeat
        } while (timeLeft > EPSILON_TIME);  // Ignore remaining time less than threshold
    }
   ......
           ......

    /** The control panel (inner class). */
    class ControlPanel extends JPanel {

        /** Constructor to initialize UI components */
        public ControlPanel() {
            // A checkbox to toggle pause/resume all the balls' movement
            JCheckBox pauseControl = new JCheckBox();
            this.add(new JLabel("Pause"));
            this.add(pauseControl);
            pauseControl.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    paused = !paused;  // Toggle pause/resume flag
                }
            });

            // A slider for adjusting the speed of all the balls by a factor
            final float[] ballSavedSpeedXs = new float[MAX_BALLS];
            final float[] ballSavedSpeedYs = new float[MAX_BALLS];
            for (int i = 0; i < currentNumBalls; ++i) {
                ballSavedSpeedXs[i] = balls[i].speedX;
                ballSavedSpeedYs[i] = balls[i].speedY;
            }
            int minFactor = 5;    // percent
            int maxFactor = 200;  // percent
            JSlider speedControl = new JSlider(JSlider.HORIZONTAL, minFactor, maxFactor, 100);
            this.add(new JLabel("Speed"));
            this.add(speedControl);
            speedControl.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    JSlider source = (JSlider)e.getSource();
                    if (!source.getValueIsAdjusting()) {
                        int percentage = (int)source.getValue();
                        for (int i = 0; i < currentNumBalls; ++i) {
                            balls[i].speedX = ballSavedSpeedXs[i] * percentage / 100.0f;
                            balls[i].speedY = ballSavedSpeedYs[i] * percentage / 100.0f;
                        }
                    }
                }
            });

            // A button for launching the remaining balls
            final JButton launchControl = new JButton("Launch New Ball");
            this.add(launchControl);
            launchControl.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (currentNumBalls < MAX_BALLS) {
                        ++currentNumBalls;
                        if (currentNumBalls == MAX_BALLS) {
                            // Disable the button, as there is no more ball
                            launchControl.setEnabled(false);
                        }
                    }
                }
            });
        }
    }
}