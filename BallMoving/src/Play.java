import java.util.ArrayList;

public class Play {

    public static void main(String[] args) {
        int n = 2;
        ArrayList<Integer> no = new ArrayList<Integer>(n);
        Bord bord = new Bord(200, 150);
        for (int i = 1; i <= n; i++)
            no.add(i);
        Balls ball = new Balls(23, 13, 34,3);
        int BOX_WIDTH = bord.width;
        int BOX_HEIGHT = bord.length;

        Balls ball1 = null;
        final float[] ballRadius = {ball.Redius, ball1.getRedius()}; // Ball's radius
        final float[] ballX = {ball.getX()}; // Ball's center (x, y)
        final float[] ballY = {ball.getY()};
        final float[] ballSpeedX = {10};
        final float[] ballSpeedY = {15};

        int UPDATE_RATE = 3;

        Thread gameThread = new Thread() {
            public void run() {
                while (true) { // Execute one update step
                    int i = ball.noOfball;
                    ballX[i] += ballSpeedX[i];
                    ballY[i] += ballSpeedY[i];
                    if (ballX[i] - ballRadius[i] < 0) {
                        ballSpeedX[i] = -ballSpeedX[i];
                        ballX[i] = ballRadius[i];
                    } else if (ballX[0] + ballRadius[0] > BOX_WIDTH) {
                        ballSpeedX[0] = -ballSpeedX[0];
                        ballX[0] = BOX_WIDTH - ballRadius[0];
                    }
                    if (ballY[0] - ballRadius[0] < 0) {
                        ballSpeedY[0] = -ballSpeedY[0];
                        ballY[0] = ballRadius[0];
                    } else if (ballY[0] + ballRadius[0] > BOX_HEIGHT) {
                        ballSpeedY[0] = -ballSpeedY[0];
                        ballY[0] = BOX_HEIGHT - ballRadius[0];
                    }
                    System.out.println("balx, baly" + ballX[0] + "," + ballY[0]);
                        try {
                            Thread.sleep(1000 / UPDATE_RATE);  // milliseconds
                        } catch (InterruptedException ex) {
                        }
                    }
                }
    //   gameThread.start();  // Callback run()
        };
    }
}