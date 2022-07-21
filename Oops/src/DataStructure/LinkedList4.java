package DataStructure;
import java.util.*;
public class LinkedList4 {
    public static void main(String args[]) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        //Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        /*List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Rai");//adding object in arraylist
        al.add("Viay");
        al.add("Xavi");
        al.add("Aay");*/

        List<String> al2 = new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");
        al2.add("Anil");
        al2.add("King");
        Collections.sort(al2);//,Collections.reverseOrder());

        //Creating Array
        String[] array = {"Java", "Python", "PHP", "C++"};
        System.out.println("Printing Array: " + Arrays.toString(array));
        //Converting Array to List
        List<String> list = new ArrayList<String>();
        for (String lang : array) {
            list.add(lang);
        }
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        list2.add(67);

        //list2.listIterator();
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for (Integer number : list2)
            System.out.println(number);

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));
//Sorting elements on the basis of name
        Comparator<Student> cm1 = Comparator.comparing(Student::getName);
        Collections.sort(al, cm1);
        System.out.println("Sorting by Name");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        //Sorting elements on the basis of age
        Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
        Collections.sort(al, cm2);
        System.out.println("Sorting by Age");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);

            System.out.println("Printing List: " + list);
            System.out.println("Printing List: " + list);
            System.out.println("arraylist: " + al);
            System.out.println("linkedlist: " + al2);

            Integer[] A = {22, 45,33, 66, 55, 34, 77};
            Integer[] B = {33, 2, 83, 45, 3, 12, 55};
            Set<Integer> set1 = new HashSet<Integer>();
            set1.addAll(Arrays.asList(A));
            Set<Integer> set2 = new HashSet<Integer>();
            set2.addAll(Arrays.asList(B));

            // Finding Union of set1 and set2
            Set<Integer> union_data = new HashSet<Integer>(set1);
            union_data.addAll(set2);
            System.out.print("Union of set1 and set2 is:");
            System.out.println(union_data);

            // Finding Intersection of set1 and set2
            Set<Integer> intersection_data = new HashSet<Integer>(set1);
            intersection_data.retainAll(set2);
            System.out.print("Intersection of set1 and set2 is:");
            System.out.println(intersection_data);

            // Finding Difference of set1 and set2
            Set<Integer> difference_data = new HashSet<Integer>(set1);
            difference_data.removeAll(set2);
            System.out.print("Difference of set1 and set2 is:");
            System.out.println(difference_data);

        }
    }
}