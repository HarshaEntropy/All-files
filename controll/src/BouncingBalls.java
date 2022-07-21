import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;

public class BouncingBalls extends JPanel implements MouseListener {

    private Ball ball;
    protected List<Ball> balls = new ArrayList<Ball>(20);
    private Container container;
    private DrawCanvas canvas;
    private int canvasWidth;
    private int canvasHeight;
    public static final int UPDATE_RATE = 30;

    int x = random(480);
    int y = random(480);
    int speedX = random(30);
    int speedY = random(30);
    int radius = random(20);
    int red = random(255);
    int green = random(255);
    int blue = random(255);
    int count = 0;

    public static int random(int maxRange) {
        return (int) Math.round((Math.random() * maxRange));
    }

    public BouncingBalls(int width, int height){

        canvasWidth = width;
        canvasHeight = height;

        ball = new Ball(x, y, speedX, speedY, radius, red, green, blue);
        container = new Container();

        canvas = new DrawCanvas();
        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER);
        this.addMouseListener(this);

    }

    public void start(){

        Thread t = new Thread(){

            public void run(){

                while(true){

                    update();
                    repaint();
                    try {
                        Thread.sleep(1000 / UPDATE_RATE);
                    } catch (InterruptedException e) {}
                }
            }
        };
        t.start();
    }

    public void update(){

        ball.move(container);
    }

    class DrawCanvas extends JPanel{

        public void paintComponent(Graphics g){

            super.paintComponent(g);
            container.draw(g);
            ball.draw(g);
        }

        public Dimension getPreferredSize(){

            return(new Dimension(canvasWidth, canvasHeight));
        }
    }

    public static void main(String[] args){

        javax.swing.SwingUtilities.invokeLater(new Runnable(){

            public void run(){

                JFrame f = new JFrame("Bouncing Balls");
                f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
                f.setContentPane(new BouncingBalls(500, 500));
                f.pack();
                f.setVisible(true);
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {

        count++;
        balls.add(new Ball(x, y, speedX, speedY, radius, red, green, blue));
        balls.get(count-1).start();
        start();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}