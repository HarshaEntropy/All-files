import java.util.ArrayList;
import java.util.List;

class Student18 implements Cloneable{
    int rollno;
    String name;
    List<String> list= new ArrayList<String>();
    Student18(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Student18() {
    }

    public List<String> addStudent(int rollno, String name){
        list.add(rollno,name);
        return list;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            Student18 sing = new Student18();
            Student18 s1=new Student18(101,"amit");
            Student18 s2=(Student18)s1.clone();
            sing.addStudent(5668,"exts");
            sing.addStudent(3121,"Harsha");
            System.out.println(sing.rollno+" "+sing.name);
            System.out.println("----------");
            Student18 rsi=(Student18)sing.clone();
            System.out.println(rsi.rollno+" "+rsi.name);
            System.out.println("------------");
            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){
            System.out.println(c);
        }

    }
}
