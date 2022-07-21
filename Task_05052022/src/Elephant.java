public class Elephant extends Lion {
    String name;
    int age;
    int yearOfJoin;
    public Elephant(String name,int age,int yearOfJoin){
        super();
        this.name = name;
        this.age = age;
        this.yearOfJoin = yearOfJoin;
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
    public  String toString(){
        return ("Elephant name is : " + name + ", Age is: " + age + ", and Year of join : " + yearOfJoin);
    }

}