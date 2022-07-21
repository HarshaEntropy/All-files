import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<Lion> elefants = new ArrayList<>();
            ArrayList<Lion> lion = new ArrayList<>();
            ArrayList<Worker> worker = new ArrayList<>();
            ArrayList<Geatkeper> geatkeper = new ArrayList<>();
            elefants.add(new Elephant("dami", 58, 1952));
            elefants.add(new Elephant("kira",23,2000));
            elefants.add( new Elephant("bau", 19, 1999));
            elefants.add( new Elephant("ravi", 18, 1999));
            elefants.add(new Elephant("kiali",23,2000));

            lion.add( new Lion("ravi", 23, 1999));
            worker.add( new Worker("ambika", 19));
            worker.add( new Worker("daruth", 29));
            geatkeper.add( new Geatkeper("kong", 29));
            geatkeper.add( new Geatkeper("bing", 34));
            geatkeper.add( new Geatkeper("kari", 27));


        for (Worker staf1:geatkeper
             ) {
            System.out.println("-----------");
            System.out.println(staf1 );
        }
        for (Worker staf2:worker
             ) {
            System.out.println("-----------");
            System.out.println(staf2);
        }
        for (Animals Animal1:lion
             ) {
            System.out.println("-----------");

            System.out.println(Animal1);
        }
        for (Animals Animal2:elefants
             ) {
            System.out.println("-----------");
            System.out.println(Animal2);
        }

        }

    }