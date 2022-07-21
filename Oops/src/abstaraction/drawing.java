package abstaraction;

abstract class drawing {
    abstract void draw();
}
class Rectangle extends drawing{
    void draw(){System.out.println("drawing rectangle");}
}
class Circle1 extends drawing{
    void draw(){System.out.println("drawing circle");}
}