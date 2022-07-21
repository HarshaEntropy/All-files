import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Type of animal(lion/2. elephant):");
        char types = input.next().charAt(5);
        switch (types){
            case 'l':
            case 'L':
            System.out.println("kran");System.out.println(types);
            break;
            case 'e':
            case'E':
                System.out.println("fuck u");
                break;

        }


    }
}
