import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class Ball {
    int diameter;
    long delay;
    private int vx;
    private int vy;
    public Ball( int xvelocity, int yvelocity) {
        diameter = 30;
        delay = 100;

        vx = xvelocity;
        vy = yvelocity;

        new Thread(String.valueOf(this)).start();

    }

    public Ball() {

    }

    public void run() {

        try {
            // Randamize the location...
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    int x = (int) (67);
                    int y = (int) (67);

                    setLocation(x, y);
                }

                private void setLocation(int x, int y) {
                }
            });
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        } catch (InvocationTargetException exp) {
            exp.printStackTrace();
        }

    }

    public Dimension getPreferredSize() {
        return new Dimension(30, 30);
    }
    public void Balls() {
    // Randomize the speed and direction...
    add(new Ball( 10 - (int) Math.round((Math.random() * 20)), 10 - (int) Math.round((Math.random() * 20))));
    add(new Ball( 10 - (int) Math.round((Math.random() * 20)), 10 - (int) Math.round((Math.random() * 20))));
    add(new Ball(12,45));
}

    private void add(Ball ball) {
    }

    private void setSize(int i, int i1) {
    }
}
