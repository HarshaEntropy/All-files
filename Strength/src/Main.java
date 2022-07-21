import java.awt.*;

public class Main implements Ball{
    public void move() {

    int x = getX();
    int y = getY();

    if (x + vx < 0 || x + diameter + vx > ) {
        vx *= -1;
    }
    if (y + vy < 0 || y + diameter + vy > getParent().getHeight()) {
        vy *= -1;
    }
    x += vx;
    y += vy;

    // Update the size and location...
    Ball.setSize(getPreferredSize());
    setLocation(x, y);
    System.out.println("ball Color"+ Color.getColor("blue")+"ballx"+x+"Ballly");
}

    private Object getPreferredSize() {
    }
}