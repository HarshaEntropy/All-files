import java.lang.reflect.Array;
import java.util.ArrayList;

public class testing {
    static Bord bord = new Bord(200, 150);


    static int BOX_WIDTH = bord.width;
    static int BOX_HEIGHT = bord.length;

    private static Balls ball;
    static float ballRadius = ball.Redius;
    static float ballX = ball.getX();
    static float ballY = ball.getY();
    static int noOfball= ball.getNoOfball();
    static float ballSpeedX = 10;
    static float ballSpeedY = 15;

    static int UPDATE_RATE = 3;

    static <ballX, ballRadius, ballY, noOfball> void mai() {
            while (true) {
                int i=0;
                while(i<=noOfball){
                ballX += ballSpeedX;
                ballY += ballSpeedY;
                if (ballX - ballRadius < 0) {
                    ballSpeedX = -ballSpeedX;
                    ballX = ballRadius;
                } else if (ballX + ballRadius > BOX_WIDTH) {
                    ballSpeedX = -ballSpeedX;
                    ballX = BOX_WIDTH - ballRadius;
                }
                if (ballY - ballRadius < 0) {
                    ballSpeedY = -ballSpeedY;
                    ballY = ballRadius;
                } else if (ballY + ballRadius > BOX_HEIGHT) {
                    ballSpeedY = -ballSpeedY;
                    ballY = BOX_HEIGHT - ballRadius;
                }
                System.out.println("ballx "+i+" bally" + ballX + "," + ballY);
            i++;}
            try {
                    Thread.sleep(1000 / UPDATE_RATE);
                }
                catch (InterruptedException e) {
                    System.out.println("somthing happing");
                    return;
                }
            }
    }

    public static void main(String[] args) {
        mai();
    }
    }