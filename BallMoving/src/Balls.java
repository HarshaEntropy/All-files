import javax.swing.*;
import java.awt.*;

public class Balls {
    float X;
    float Y;
    float Redius;
    int noOfball;
    public Balls(float X,float Y, float Radius,int noOfball){
        this.X = X;
        this.Y = Y;
        this.Redius = Radius;
        this.noOfball= noOfball;
    }

    public Balls(){}

    public int getNoOfball() {
        return noOfball;
    }

    public void setNoOfball(int noOfball) {
        this.noOfball = noOfball;
    }

    public float getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }
    public void add(float X,float Y, float Radius,int noOfball){
        this.X = X;
        this.Y = Y;
        this.Redius = Radius;
        this.noOfball= noOfball;

    }

    public float getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public float getRedius() {
        return Redius;
    }

    public void setRedius(int redius) {
        Redius = redius;
    }

}
