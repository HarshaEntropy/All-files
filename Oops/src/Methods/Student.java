package Methods;

import java.util.*;

public class Student {

    String name;
    int age;
    String address;
    public Student(String name , int age , String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String toString(){
        return ("Stdent name is " + this.getName() +
                ", age is: " + this.getAge() + "and address is : " + this.getAddress());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        //      System.out.println("Enter the Type of animal(lion/elephant):");
    //    String type = input.nextLine();
        int st;
        Collection<Student> jho = new ArrayList<Student>();
        do {
            Student john = new Student("john", 25, "23 east cost maker road");
            System.out.println("Stdent name is " + john.getName());
            System.out.println(john.getAge());
            System.out.println(john.getAddress());
            System.out.println(john.toString());
            st = input.nextInt();
            switch (st){
                case 1:
                    System.out.println("Enter name");
                    String paru = input1.nextLine();
                    System.out.println("enter age");
                    int visu = input1.nextInt();
                    System.out.println("enter addres");
                    String plase = input1.nextLine();

                    jho.add(new Student(paru,visu,plase));
                break;
                case 2:
                    System.out.println(jho);
                    break;
            }
        }
        while (st!=0);
    }

}
