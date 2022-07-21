package Collection;
import java.io.*;
import java.util.Scanner;
public class ReadCSVExample1
{
    public static void main(String[] args) throws Exception
    {
//parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("/home/harshavardhan/Downloads/annual-enterprise-survey-2020-financial-year-provisional-csv.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner
    }
}