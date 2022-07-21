import java.util.*;
public class Lion {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfJoin() {
        return yearOfJoin;
    }

    public void setYearOfJoin(int yearOfJoin) {
        this.yearOfJoin = yearOfJoin;
    }
    public String toString(){
        return ("lion name is " + name +
                ", age is: " + age + ", and year of join is : " + yearOfJoin);
    }
}