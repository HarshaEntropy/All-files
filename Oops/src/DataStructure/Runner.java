package DataStructure;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        stack1 list = new stack1();
        list.push(5);
        list.push(23);
        list.push(89);
        list.push(89);
        list.push(89);
        list.push(89);


        //System.out.println("fytuyi--"+ list.pop());
        System.out.println("size -- "+ list.size());
        list.show();

    }
}
