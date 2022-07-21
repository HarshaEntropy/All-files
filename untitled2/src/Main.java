import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sc;
            sc = input.nextInt();

            switch (sc) {
                case 1:{
                    System.out.println("Start eating");
                    break;
                }
                case 2: {
                    System.out.println("Clean dishes");
                }
                case 3: case 4: case 5:                {
                    System.out.println("Go to sleep");
                    break;
                }
                default:{
                    System.out.println("Enter some thing between 1 to 5");
                }
            }

//        System.out.println("Hello world!");
    }
}