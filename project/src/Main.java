import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        stack list = new stack();
        list.push(67);
        list.push(12);
        list.push(23);
       // System.out.println(list.capacity);
        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println("--------");
        list.show();
        System.out.println("--------");
        //System.out.println(list);
        list.push(67);
        list.push(12);
        list.push(23);
        list.show();
      //  list.push(230);

        //  System.out.println(list.capacity);
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.show();
        list.push(12);
        list.show();
       // System.out.println(list.capacity);



    }
}