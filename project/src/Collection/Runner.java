package Collection;

public class Runner {
    public static void main(String[] args) {
        queue mike = new queue();
        System.out.println(mike.isEmpty());
        mike.add(12);
        mike.add(23);
        mike.add(98);
        mike.add(23);
        mike.add(98);
        mike.show();
        System.out.println(mike.remove());
        mike.show();
        mike.add(98);
        mike.show();
        System.out.println(mike.peek());
        System.out.println(mike.poll());
        System.out.println(mike.peek());

        // mike.peek();

    }
}
