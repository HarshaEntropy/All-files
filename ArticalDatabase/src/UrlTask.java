import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.*;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UrlTask {
    public static void main(String[] args) {
        try {
//            Access userDetail=new Access();
            UserDetail file=null;
            URL url = new URL("http://50.19.24.41/api/auth/login");
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
//            http.setDoInput(true);
            http.setDoOutput(true);
//            http.setInstanceFollowRedirects(false);
            http.setRequestMethod("POST");
            JSONObject jsObject = new JSONObject();
            System.out.println("Enter login Id:");
            Scanner inputEmail=new Scanner(System.in);
//            String email=inputEmail.nextLine();
            jsObject.put("email","green@yopmail.com");
            System.out.println("Enter Password");
            Scanner inputPassword=new Scanner(System.in);
//            String password=inputPassword.nextLine();
            jsObject.put("password","tT@test123");
            String data = jsObject.toJSONString();
            System.out.println(data);
            http.setRequestProperty("client-id","437920819fa89d19abe380073d28839c");
            http.setRequestProperty("client-secret","28649120bdf32812f433f428b15ab1a1");
            http.setRequestProperty("content-type","application/json");
                OutputStream outputStream = con.getOutputStream();
                DataOutputStream dos = new DataOutputStream(outputStream);
                dos.writeBytes(data);

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(bufferedReader);

                JSONObject userDetails =  (JSONObject) obj;
                System.out.println(userDetails.toJSONString());
                System.out.println(userDetails.get("data"));
                Object objA = parser.parse(userDetails.get("data").toString());
                JSONObject userDetails1 = (JSONObject) objA;
                System.out.println("Bearer"+" "+userDetails1.get("accessToken").toString());

//
//                Iterator<JSONObject> iterator = userDetails.;
//                while (iterator.hasNext()) {
//                    JSONObject details = iterator.next();
//                    userDetail.addDetails((String) details.get("accessToken"));
//                }
                if (http.getResponseCode()==200){
                    URL url1 = new URL("http://50.19.24.41/api/song/songs-list?bandId=2&currentPage=1&perPage=10");
                    URLConnection con1 = url1.openConnection();
                    HttpURLConnection http1 = (HttpURLConnection)con1;
//                    http1.setDoInput(true);
//                    http1.setDoOutput(true);
//                    http1.setInstanceFollowRedirects(false);
                    http1.setRequestMethod("GET");
                    http1.setRequestProperty("client-id","437920819fa89d19abe380073d28839c");
                    http1.setRequestProperty("client-secret","28649120bdf32812f433f428b15ab1a1");
                    http1.setRequestProperty("Authorization","Bearer"+" "+userDetails1.get("accessToken").toString());
                    try {
                    BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(con1.getInputStream()));
                    Object obj1 = parser.parse(bufferedReader1);
                    JSONObject userDetails2 =  (JSONObject) obj1;
                    System.out.println("---------------------------------------------");
                    System.out.println(userDetails2.toJSONString());}
                    catch (IOException e){
                        System.out.println("Empty file");
                    }

                    System.out.println(http1.getResponseCode());
                }

            System.out.println(http.getResponseCode()+" message "+http.getResponseMessage());

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Empty file");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
class UserDetail{
    String accessToken;
    String data;

    public UserDetail(String accessToken){
        this.accessToken = accessToken;
    }

    public UserDetail() {
    }

    public String getData() {
        return data;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
class songs{
    String songURL;

}
class Processes {
    public String sending(String urlId) {
        URL ur = null;
        String accessToken;
        try {
            ur = new URL(urlId);
            URLConnection con = ur.openConnection();
            HttpURLConnection http1 = (HttpURLConnection) con;
            http1.setDoInput(true);
            http1.setDoOutput(true);
            http1.setInstanceFollowRedirects(false);
            http1.setRequestMethod("POST");
            JSONObject jsObject = new JSONObject();
            System.out.println("Enter login Id:");
            Scanner inputEmail = new Scanner(System.in);
            String email = inputEmail.nextLine();
            jsObject.put("email", email);
            System.out.println("Enter Password");
            Scanner inputPassword = new Scanner(System.in);
            String password = inputPassword.nextLine();
            jsObject.put("password", password);
            String data = jsObject.toJSONString();
            System.out.println(data);
            http1.setRequestProperty("client-id", "437920819fa89d19abe380073d28839c");
            http1.setRequestProperty("client-secret", "28649120bdf32812f433f428b15ab1a1");
            http1.setRequestProperty("content-type", "application/json");
            OutputStream outputStream = con.getOutputStream();
            DataOutputStream dos = new DataOutputStream(outputStream);
            dos.writeBytes(data);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(bufferedReader);

            JSONObject userDetails = (JSONObject) obj;
            accessToken = userDetails.get("data").toString();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return accessToken;
    }

    public String getData(String url, String accessToken) {
        URL url1 = null;
        String returnData = null;
        try {
            url1 = new URL(url);
            URLConnection con1 = url1.openConnection();
            HttpURLConnection http1 = (HttpURLConnection) con1;
            http1.setDoInput(true);
            http1.setDoOutput(true);
            http1.setInstanceFollowRedirects(false);
            http1.setRequestMethod("GET");
            http1.setRequestProperty("client-id", "437920819fa89d19abe380073d28839c");
            http1.setRequestProperty("client-secret", "28649120bdf32812f433f428b15ab1a1");
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(accessToken);
            JSONObject userDetails = (JSONObject) obj;
            http1.setRequestProperty("Authorization", "Bearer" + " " + userDetails.get("accessToken").toString());
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(con1.getInputStream()));
            Object obj1 = parser.parse(bufferedReader1);
            JSONObject userDetails2 = (JSONObject) obj1;
            System.out.println("---------------------------------------------");
            returnData = userDetails2.toJSONString();
            System.out.println(returnData);
        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
        return returnData;
    }

    public JSONObject stringToJsonObject(String data) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            Object object = parser.parse(data);
            jsonObject = (JSONObject) object;

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }

    public URLConnection urlToUrlConnection(String url) {
        URLConnection con1 = null;
        try {
            URL url1 = new URL(url);
            con1 = url1.openConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return con1;
    }

    public HttpURLConnection urlToHttp(URLConnection url) {
        HttpURLConnection http = null;
        http = (HttpURLConnection) url;
        http.setDoInput(true);
        http.setDoOutput(true);
        http.setInstanceFollowRedirects(false);
        return http;
    }

    public JSONObject readDataToJson(URLConnection con1) {
        JSONObject jsonObject = null;
        try {
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(con1.getInputStream()));
            JSONParser parser = new JSONParser();
            Object obj1 = parser.parse(bufferedReader1);
            jsonObject = (JSONObject) obj1;

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }
    public void sendDataAsGiven(URLConnection con,JSONObject data){
        OutputStream outputStream = null;
        try {
            outputStream = con.getOutputStream();
            DataOutputStream dos = new DataOutputStream(outputStream);
            dos.writeBytes(data.toJSONString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Music{
    int songID;
    String songURL;
}
//    Enter login Id:
//        green@yopmail.com
//Enter Password
//        tT@test123