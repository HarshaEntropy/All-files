import java.net.*;
public class URLExample {
    public static void main(String[] args){
        try{
            URL url=new URL("https://jsonplaceholder.typicode.com/todos");
            System.out.println("Protocol: "+url.getProtocol());// Using getProtocol() method of the URL class
            System.out.println("Host Name: "+url.getHost()); // Using getHost() method
            System.out.println("Port Number: "+url.getPort());  // Using getPort() method
            System.out.println("File Name: "+url.getFile());    //Using getFile() method
        }
        catch(Exception e)
        {
            System.out.println(e);}
    }
}