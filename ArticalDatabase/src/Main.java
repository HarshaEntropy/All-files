import org.json.simple.JSONObject;

import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UrlFunction function=new UrlFunction();


//        RequestHandler requestHandler = new RequestHandler();
//        HashMap headers = new HashMap();
//        headers.put(clientid, value);
//        headers.put(clientser, value);
//        JSONObject  jsonObject =
//        JSONObject response = re
//        questHandler.post(url,headers, body);



        URLConnection url =function.urlToUrlConnection("http://50.19.24.41/api/auth/login");
        HttpURLConnection http =function.urlToHttp(url);
        JSONObject jsObject = new JSONObject();
        System.out.println("Enter login Id:");
        Scanner inputEmail = new Scanner(System.in);
        String email = inputEmail.nextLine();
        jsObject.put("email", email);
        System.out.println("Enter Password");
        Scanner inputPassword = new Scanner(System.in);
        String password = inputPassword.nextLine();
        jsObject.put("password", password);
        function.inputtingRequestProperty("client-id", "437920819fa89d19abe380073d28839c");
        function.inputtingRequestProperty("client-secret", "28649120bdf32812f433f428b15ab1a1");
        function.inputtingRequestProperty("content-type", "application/json");
        HashMap list=function.getList();
        function.httpRequestProcess(http,"POST",list);
        function.sendDataAsGiven(url,jsObject);
        try {
            System.out.println(http.getResponseCode());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



//        Database db = new Database();
//        db.adduser(new Users(0,"nianka","hoajoa","Hanki@gmail.com"));
//        db.adduser(new Users(1,"kang","ding","Danki@gmail.com"));
//        db.adduser(new Users(2,"jing","lang","lanki@gmail.com"));
//        db.adduser(new Users(3,"sanki","kainf","sanki@gmail.com"));
//        db.getUsers();
//
//        System.out.println("-------------");
//        db.getUsers(1);
//        db.getUsers(3);

}