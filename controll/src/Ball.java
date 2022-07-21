import java.awt.Color;
import java.awt.Graphics;

public class Ball{

    public static int random(int maxRange) {
        return (int) Math.round((Math.random() * maxRange));
    }

    private BouncingBalls balls;
    int x = random(480);
    int y = random(480);
    int speedX = random(30);
    int speedY = random(30);
    int radius = random(20);
    int red = random(255);
    int green = random(255);
    int blue = random(255);
    int i = 0;

    public Ball(int x, int y, int speedX, int speedY, int radius, int red, int green, int blue){

        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
        this.radius = radius;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void draw(Graphics g){

        for(Ball ball : balls){

            g.setColor(new Color(red, green, blue));
            g.fillOval((int)(x - radius), (int)(y - radius), (int)(2 * radius), (int)(2 * radius));
        }
    }

    public void move(Container container){

        x += speedX;
        y += speedY;

        if(x - radius < 0){

            speedX = -speedX;
            x = radius;
        }
        else if(x + radius > 500){

            speedX = -speedX;
            x = 500 - radius;
        }

        if(y - radius < 0){

            speedY = -speedY;
            y = radius;
        }
        else if(y + radius > 500){

            speedY = -speedY;
            y = 500 - radius;
        }
    }

    public void start() {

    }
}
