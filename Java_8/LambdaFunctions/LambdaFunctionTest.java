package LambdaFunctions;

public class LambdaFunctionTest {
    public static void main(String[] args) {
        int width=10;

        //without lambda, LambdaFunctions.Drawable implementation using anonymous class
//        LambdaFunctions.Drawable d=new LambdaFunctions.Drawable(){
//            public void draw(){System.out.println("Drawing "+width);}

        Drawable d=()->System.out.println("Drawing"+width);
        d.draw();

    }
    }
interface Drawable{
    public void draw();
}