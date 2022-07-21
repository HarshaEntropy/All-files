
import java.awt.Color;
import java.awt.Graphics;

public class Container {

    private static final int HEIGHT = 500;
    private static final int WIDTH = 500;
    private static final Color COLOR = Color.WHITE;

    public void draw(Graphics g){

        g.setColor(COLOR);
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }
}