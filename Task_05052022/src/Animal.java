import java.util.*;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int st;
        Collection<Lion> lions = new ArrayList<Lion>();
        ArrayList<Elephant> elect = new ArrayList<Elephant>();


        do {
            System.out.println("Enter Number to operate as following data :");
            System.out.println("1. Insert Data");
            System.out.println("2. Display");
            System.out.println("3. Search");
            //           System.out.println("4. Delete");
            //           System.out.println("5. Update");
            st = input.nextInt();
            switch (st) {
                case 1:
                    int s;
                    do {
                        System.out.println("Enter Number to operate as following data :");
                        System.out.println("1.Lion");
                        System.out.println("2. Elephant");
                        System.out.println("3. Main");
                        s = input.nextInt();
                        switch (s) {
                            case 1:
                                System.out.println("Enter Name :");
                                String paru = input1.nextLine();
                                System.out.println("Enter Age : ");
                                int visu = input.nextInt();
                                System.out.println("Enter YEar of Join : ");
                                int plase = input2.nextInt();
                                lions.add(new Lion(paru, visu, plase));
                                break;
                            case 2:
                                System.out.println("Enter Name :");
                                String ele = input1.nextLine();
                                System.out.println("Enter Age : ");
                                int vilu = input.nextInt();
                                System.out.println("Enter YEar of Join : ");
                                int pla = input2.nextInt();
                                elect.add(new Elephant(ele, vilu, pla));
                                break;
                        }

                    }
                    while (s != 3);
                    break;
                case 2:
                    int h;
                    do {
                        System.out.println("Enter Number to operate as following data :");
                        System.out.println("1.Lion");
                        System.out.println("2. Elephant");
                        System.out.println("3. Main");
                        h = input.nextInt();
                        switch (h) {
                            case 1:
                                System.out.println("----------------");
                                Iterator<Lion> i = lions.iterator();
                                while (i.hasNext()) {
                                    Lion e = i.next();
                                    System.out.println("Lions Names: ");
                                    System.out.println(e);
                                    System.out.println("-----------------");
                                }
                                break;
                            case 2:
                                System.out.println("----------------");
                                Iterator<Elephant> k = elect.iterator();
                                while (k.hasNext()) {
                                    Elephant j = k.next();
                                    System.out.println("Elephant Names: ");
                                    System.out.println(j);
                                    System.out.println("-----------------");
                                }
                                break;
                        }
                    }
                    while (h != 3);
                    break;

                case 3:
                    int ht;
                    do {
                        System.out.println("Enter Number to operate as following data :");
                        System.out.println("1.Lion");
                        System.out.println("2. Elephant");
                        System.out.println("3. Main");
                        ht = input.nextInt();
                        switch (ht) {
                            case 1:

                                boolean found = false;
                                System.out.println("Enter name of Lion");
                                String par = input.next();
                                System.out.println("-------------");
                                Iterator<Lion> i = lions.iterator();
                                while (i.hasNext()) {
                                    Lion e = i.next();
                                    if (e.getName().equals(par)) {
                                        System.out.println(e);
                                        found = true;
                                    }
                                }
                                System.out.println("----------");
                                if (!found) {
                                    System.out.println("Record not Found");
                                    break;
                                }
                            case 2:
                                found = false;
                                System.out.println("Enter name of Lion");
                                String park = input.next();
                                System.out.println("-------------");
                                Iterator<Elephant> k = elect.iterator();
                                while (k.hasNext()) {
                                    Lion j = k.next();
                                    if (j.getName().endsWith(park)) {
                                        System.out.println(j);
                                        found = true;
                                    }
                                }
                                System.out.println("----------");
                                if (!found) {
                                    System.out.println("Record not Found");
                                    break;
                                }

                        }
                    }
                    while (ht != 3);
                    break;
            }
            }
            while (st != 0) ;
        }

    }