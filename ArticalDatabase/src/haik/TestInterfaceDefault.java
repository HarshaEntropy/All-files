package haik;

interface Drawable{
    void draw();
    default void msg(){System.out.println("default method");
    }
    private Rectangle king(){
        System.out.println("we are kings");
        return null;
    }
    static int cube(int x){return x*x*x;}

}
interface Donkey{
    void king();
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
    void msgs(){System.out.println("default method");}
    class Cirlcle {
        public void draw(){
            System.out.println("circle");
        }
    }
}
class TestInterfaceDefault{

    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        d.msg();
        Drawable.cube(5);
        System.out.println("-----------------");
        Rectangle m = new Rectangle();
        m.draw();
        System.out.println("-----------------");

        System.out.println(Drawable.cube(4));

    }}