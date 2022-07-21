package haik;

import java.util.ArrayList;
import java.util.List;

interface Printable{
    void print();
    void relax();
    List<King> kings = new ArrayList<>();

}
interface Showable{
    void print();


}

class King{
    String name;
    String nikeNmae;
    public King(String name,String nikeNmae){
        this.name=name;
        this.nikeNmae=nikeNmae;
    }
    void move(){
        System.out.println("harki");

    }
    public String getName() {
        return name;
    }

    public String getNikeNmae() {
        return nikeNmae;
    }
        public King addKing(String name,String nikeNmae){
        King newKing = new King(name,nikeNmae);

        return newKing;
    }

}

class TestInterface3 implements Printable, Showable{
    public void print(){System.out.println("Hello");}
    public void relax(){
        System.out.println("Im Relaxed!");
    }
    public static void main(String args[]){
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}