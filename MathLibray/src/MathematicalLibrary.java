public class MathematicalLibrary {
    public int add(int x,int y){
        return x+y;
    }
    public int substation(int x, int y){
        return x-y;
    }
    public int multiplication(int x, int y){
        return x*y;
    }
    public int division(int x,int y){
        return  x/y;
    }
}
class MathLib extends MathematicalLibrary{
    public int cube(int x){
        return x*x*x;
    }
    public double square(int x) {
        return Math.sqrt(2);
    }

    public int doubl(int x){
        return 2*x;
    }
}
interface ScientificCalculator{
    int sin(int x,int y);
    int cos(int x,int y);
    int tan(int x,int y);
}
class IndianScientificCalculator extends MathLib implements ScientificCalculator,ZimbabweCalculator{
    public int sin(int x,int y){
        return x/y;
    }
    public int cos(int x,int y){
        return x/y;
    }
    public int tan(int x,int y){
        return x/y;
    }
    public int age(int x){
        return (x*5)/7;
    }
}
class UsaScientificCalculator extends MathLib implements ScientificCalculator{
    public int sin(int x,int y){
        return x*3/y;
    }
    public int cos(int x,int y){
        return x*5/y;
    }
    public int tan(int x,int y){
        return x*2/y;
    }
}
interface ZimbabweCalculator {
    int age(int x);
}
