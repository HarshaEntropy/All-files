package haik;
// class representing custom exception
class MyCustomException extends Exception
{

}

// class that uses custom exception MyCustomException
public class TestCustomException2
{
    // main method
    public static void main(String args[])
    {
        try
        {
            System.out.println("------------");
            // throw an object of user defined exception
            throw new MyCustomException();
        //    System.out.println("------------");
        }
        catch (MyCustomException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex);
        }

        System.out.println("rest of the code...");
    }
}