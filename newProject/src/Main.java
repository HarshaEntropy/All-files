import java.lang.reflect.Array;

public class Main {
    public void evenOrNot(int arr[]){
        for (int i=0;i<10;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    public void primeOrNot1(int arr[]){
        for (int ar:arr) {
            int k=0;
            for (int j=ar;j>1;j--) {
                if (ar % j == 0) {
                    k++;
                }
            }if (k == 1) {
                System.out.println(ar);
            }}}
    public void fabinoki(int n){
        int a=0;
        int b=1;
        while (a<n){
            int c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }
    public void nThFabinoki(int n){
        int a=0;
        int b=1;
        int k=1;
        while (k!=n){
            int c=a+b;
            k++;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
    public void reversNo(int n){
        int rev = 0;
        int sum = 0;
        while (n!=0){
            rev = n%10;
            sum = (sum*10)+rev;
            n=n/10;
        }
        System.out.println(sum);
    }

        public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};

        Main main =new Main();
        main.evenOrNot(arr);
        main.primeOrNot1(arr);
            main.fabinoki(9);
            main.nThFabinoki(7);
            main.reversNo(237);
        System.out.println("Hello world!");
    }
}