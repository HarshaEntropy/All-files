public class WishingEveryone {
    public void greeting(String[] names){
        for (String name:names){
            System.out.println("Hi "+name);
        }
    }

    public static void main(String[] args) {
        String[] names ={"Harsha","sai","mani","hari"};

        WishingEveryone king = new WishingEveryone();
        king.greeting(names);
        int n=7;
        for (int i=0;i<=n;i++){
            System.out.print(i);
//            System.out.println("\n");
        }
    }
}
