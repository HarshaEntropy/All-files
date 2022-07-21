import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] kills) {
        System.out.println("Hello world!");
        String name = new String("Amigoscode youer 23 kill feal");
        System.out.println(name.toUpperCase());
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getHour());
        int a = 2;
        int b = 640000000;
        System.out.println("a = " + a + " b = " + b);
        System.out.printf("hahadka");
        System.out.println(name.getBytes(StandardCharsets.UTF_8));
        System.out.println(name.getBytes());
        System.out.println(name.charAt(10));
        System.out.println(name.charAt(2));
        boolean is = a < b;
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println((long) Math.pow(b,a));
        int Age = 14;
        String message = Age >= 18 ?
                "Hooray.. I am an adult":
                "I am not adult";
        System.out.println(message);

    }
}