package MethodReference;

import java.util.function.BiFunction;
class Arithmetic2{
    public int add(int a, int b){
        return a+b;
    }
}
public class InstanceMethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>adder = new Arithmetic2()::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
} 