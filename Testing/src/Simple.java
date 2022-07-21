import javax.swing.*;
import java.awt.*;

public class Simple {
    public Simple() {
    }

    public static void main(String[] args) {

        int BOX_WIDTH = 640;
        int BOX_HEIGHT = 480;

        float ballRadius = 20;
        final float[] ballX = {ballRadius + 50};
        final float[] ballY = {ballRadius + 20};
        final float[] ballSpeedX = {5};
        final float[] ballSpeedY = {8};

         int UPDATE_RATE = 3;

        Thread gameThread = new Thread() {
            public void run() {
                while (true) {
                    ballX[0] += ballSpeedX[0];
                    ballY[0] += ballSpeedY[0];
                    if (ballX[0] - ballRadius < 0) {
                        ballSpeedX[0] = -ballSpeedX[0];
                        ballX[0] = ballRadius;
                    } else if (ballX[0] + ballRadius > BOX_WIDTH) {
                        ballSpeedX[0] = -ballSpeedX[0];
                        ballX[0] = BOX_WIDTH - ballRadius;
                    }
                    if (ballY[0] - ballRadius < 0) {
                        ballSpeedY[0] = -ballSpeedY[0];
                        ballY[0] = ballRadius;
                    } else if (ballY[0] + ballRadius > BOX_HEIGHT) {
                        ballSpeedY[0] = -ballSpeedY[0];
                        ballY[0] = BOX_HEIGHT - ballRadius;
                    }
                    System.out.println("balx, baly" + ballX[0] + "," + ballY[0]);
                    try {
                        Thread.sleep(1000 / 2);
                    } catch (InterruptedException ex) { }
                }
            }
        };
        gameThread.start();
    }

}

/*
*
* Board board = new Board(400, 500);
* board.addBall(new Ball(10, 10, 50));
* board.addBall(new Ball(20, 100, 50));
* board.animate();
* */