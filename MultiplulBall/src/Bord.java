import java.util.ArrayList;

public class Bord {
    int width;
    int height;

    public Bord(int width, int height) {
        this.width = width;
        this.height = height;
    }

}


class Moves implements Runnable{
    int i; int x; int y; int radius;
    public  Moves(int i, int x, int y, int radius)
    {
        this.i=i;
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    @Override
    public void run() {
        Bord bord = new Bord(300, 100);
        int BOX_WIDTH = bord.width;
        int BOX_HEIGHT = bord.height;
        float ballSpeedX = 10;
        float ballSpeedY = 15;
        int UPDATE_RATE = 1;
        while (true) {
            x += ballSpeedX;
            y += ballSpeedY;
            if (x - radius < 0) {
                ballSpeedX = -ballSpeedX;
                x = radius;
            } else if (x + radius > BOX_WIDTH) {
                ballSpeedX = -ballSpeedX;
                x = BOX_WIDTH - radius;
            }
            if (y - radius < 0) {
                ballSpeedY = -ballSpeedY;
                y = radius;
            } else if (y + radius > BOX_HEIGHT) {
                ballSpeedY = -ballSpeedY;
                y = BOX_HEIGHT - radius;
            }
            System.out.println("ballx ," + i + " bally" + x + "," + y);

            try {
                Thread.sleep(1000 / UPDATE_RATE);
            } catch (InterruptedException e) {
            }
        }

    }
}
