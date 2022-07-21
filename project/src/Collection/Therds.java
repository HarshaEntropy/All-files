package Collection;

class Mytask implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<+10;i++){
        System.out.println("@@ Printing Document #"+i+" - Printing");
    }
    }
}
public class Therds {
    public static void main(String[] args) {
        System.out.println("starting");
        Runnable r = new Mytask();
        Thread rr =new Thread(r);
        rr.start();
        for (int i=1;i<+10;i++){
            System.out.println("Printing Document #"+i+" - Printing");
        }

        System.out.println("Ending");

    }
}
