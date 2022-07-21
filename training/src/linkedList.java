import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {

    public static void main(String[] args) {
        LinkedList<Lion> ll = new LinkedList<>();
        ll.add( new Lion("ravi", 23, 1999));
        ll.add( new Lion("mohan", 23, 1999));
        ll.add( new Lion("magana", 23, 1999));
        ll.add( new Lion("kiran", 29, 1997));
        ll.add( new Lion("Hari", 28, 1996));
        ArrayList<Elephant> lle = new ArrayList<>();
        lle.add(new Elephant("dami", 58, 1952));
        lle.add(new Elephant("kira",23,2000));
        lle.add( new Elephant("bau", 19,1999));
        lle.add( new Elephant("ravi", 18, 1999));
        lle.add(new Elephant("kiali",23,2000));

        for (Lion kings:ll
        ) {
            System.out.println(kings);
        }
        ll.addAll(lle);
        System.out.println("-------------");
        ll.addFirst(new Lion("gani",45,2003));
        for (Lion kings:ll
             ) {
            System.out.println(kings);
        }
        System.out.println("-------------");
        ll.addLast(new Lion("hari",36,2004));
        for (Lion kings:ll
        ) {
            System.out.println(kings);
        }
        System.out.println("-------------");
        //ll.clear();
        for (Lion kings:ll
        ) {
            System.out.println(kings);
        }
        System.out.println("-------------");
        ll.clone();
        for (Lion kings:ll
        ) {
            System.out.println(kings);
        }
        System.out.println("-------------");
        System.out.println(ll.clone());
        for (Lion kings:ll
        ) {
            System.out.println(kings);
        }
        System.out.println("-------------");

    }

}