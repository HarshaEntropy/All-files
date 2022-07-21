import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bord {
    int length;
    int width;
    ArrayList<String> noOfballs = new ArrayList<String>();
    public Bord(int length,int width){
        this.length = length;
        this.width = width;
    }
    public Bord(){}
//    ArrayList<Bord>=

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



}