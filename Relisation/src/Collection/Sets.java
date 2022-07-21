package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> hi = new HashSet<>();
        hi.add("ravi");
        hi.add("gani");
        hi.add("ROCKY");
        hi.add("Ram");
        System.out.println("Hi "+hi+" , I'm Harsha");
        Iterator bye = hi.iterator();
        System.out.println("Element using Iterator: ");
        While(bye.hasNext());
        {
            String s = (String) bye.next();
            System.out.println(s);
        }
    }

    private static void While(boolean hasNext) {
    }
}
