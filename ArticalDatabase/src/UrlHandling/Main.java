package UrlHandling;

import org.json.simple.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    RequestHandling requestHandling=new RequestHandling();
        HashMap<String,String> map =new HashMap<>();
        ArrayList<Music> list = new ArrayList<>();
        map.put("client-id", "437920819fa89d19abe380073d28839c");
        map.put("client-secret", "28649120bdf32812f433f428b15ab1a1");
        map.put("content-type", "application/json");
        JSONObject jsObject = new JSONObject();
        System.out.println("Enter login Id:");
        Scanner inputEmail=new Scanner(System.in);
        String email=inputEmail.nextLine();
        jsObject.put("email",email);
        System.out.println("Enter Password");
        Scanner inputPassword=new Scanner(System.in);
        String password=inputPassword.nextLine();
        jsObject.put("password",password);
        JSONObject object=requestHandling.postRequest("http://50.19.24.41/api/auth/login",map,jsObject);
        JSONObject object1=requestHandling.bringObjectFromJsonObject("data",object);
        map.put("Authorization","Bearer"+" "+object1.get("accessToken").toString());
        JSONObject object2=requestHandling.getRequest("http://50.19.24.41/api/song/songs-list?bandId=2&currentPage=1&perPage=10",map);
        JSONObject object4=requestHandling.bringObjectFromJsonObject("data",object2);
        Iterator<JSONObject> iterator=requestHandling.jasonObjectToJsonArray(object4.get("data").toString());
        while (iterator.hasNext()){
            JSONObject object3= iterator.next();
            list.add(new Music(
                    Integer.parseInt(object3.get("id").toString()),
                    (String) object3.get("song")));
        }
        Music music=new Music();
        System.out.println(music.getSongId());
    }
}
