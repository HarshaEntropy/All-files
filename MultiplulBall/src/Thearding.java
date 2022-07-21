import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thearding {
    //Max Total no of balles
    static final int noOfBalls = 9;


    public static void main(String[] goToLunch ) {

        //Give values as (no. of ball , x location of ball,y location of ball, radius of ball
        Runnable ball1 = new Moves ( 1, 23, 45, 10 );
        Runnable ball2 = new Moves ( 2, 23, 45, 11 );
        Runnable ball3 = new Moves ( 3, 34, 56, 23 );
        Runnable ball4 = new Moves ( 4, 87, 39, 94 );
        Runnable ball5 = new Moves ( 5, 98, 79, 69 );


        ExecutorService play = Executors.newFixedThreadPool( noOfBalls );
        // Execute the ball by applying play

        play.execute( ball1 );
        play.execute( ball2 );
        play.execute( ball3 );
        play.execute( ball4 );
        play.execute( ball5 );

    }
}