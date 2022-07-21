import java.util.*;

public class Zoo {
    }


class Lion extends Animals {
    String name;
    int age;
    int yearOfJoin;
    public Lion(String name,int age, int yearOfJoin){
        this.name = name;
        this.age = age;
        this.yearOfJoin = yearOfJoin;
    }

    public Lion() {

    }
    public String toString(){
        return ("lion name is " + name +
                ", age is: " + age + ", and year of join is : " + yearOfJoin);
    }
}
 class Elephant extends Lion {
    String name;
    int age;
    int yearOfJoin;
    public Elephant(String name,int age,int yearOfJoin){
        super();
        this.name = name;
        this.age = age;
        this.yearOfJoin = yearOfJoin;
    }
    public  String toString(){
        return ("Elephant name is : " + name + ", Age is: " + age + ", and Year of join : " + yearOfJoin);
    }

}
class Worker extends Humans  {
    String name;
    int age;
    public Worker (String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    public Worker() {

    }
    public  String toString(){
        return ("Worker name is : " + name + ", Age is: " + age );
    }

}
class Geatkeper extends Worker{
    String name;
    int age;
    public Geatkeper (String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    public  String toString(){
        return ("Geatkeper name is : " + name + ", Age is: " + age );
    }

}
class Animals {}
class Humans{}
