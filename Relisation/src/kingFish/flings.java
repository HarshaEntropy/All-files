package kingFish;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class flings {
    public static void main(String[] arrays) { int zero = 0;
        int [] numbers = {1, 0, 3, 64, 29};
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
         int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("your age : " + year);
         if (age < 18){
             System.out.println("and your not an adult :(");
         }else {
             System.out.println("and your an adult :)");
         }
        String [] names ={"kiran","krishan","kishor"};
        //int [] numbers = new int[3];
       /* numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 6;*/
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

    }
}
