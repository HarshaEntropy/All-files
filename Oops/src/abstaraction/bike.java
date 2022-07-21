package abstaraction;

abstract class bike {
    abstract void run();
}
class Honda4 extends bike{
    void run(){
        System.out.println("running safely");
    }
    public static void main(String ardg[]){
        bike obj = new Honda4();
        obj.run();
    }
}