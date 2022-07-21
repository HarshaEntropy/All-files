package UrlHandling;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Iterator;

public class RequestHandling {
    public JSONObject postRequest(String url, HashMap map,JSONObject object){
        JSONObject jsonObject =null;
        try{
            URL url1 = new URL(url);
            URLConnection con = url1.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setDoOutput(true);
            http.setRequestMethod("POST");
            map.forEach((key, value) -> http.setRequestProperty((String) key, String.valueOf(value)));
            OutputStream outputStream = con.getOutputStream();
            DataOutputStream dos = new DataOutputStream(outputStream);
            dos.writeBytes(object.toJSONString());
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(con.getInputStream()));
            JSONParser parser = new JSONParser();
            Object obj1 = parser.parse(bufferedReader1);
            jsonObject = (JSONObject) obj1;

        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }
    public JSONObject getRequest(String url1 ,HashMap map){
        JSONObject jsonObject=null;
        try {
            URL url = new URL(url1);
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setRequestMethod("GET");
            map.forEach((key, value) -> http.setRequestProperty((String) key, String.valueOf(value)));
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(con.getInputStream()));
            JSONParser parser=new JSONParser();
            Object obj1 = parser.parse(bufferedReader1);
            jsonObject = (JSONObject) obj1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }
    public Iterator<JSONObject> jasonObjectToJsonArray(String br){
        Iterator<JSONObject> iterator1=null;
        try{JSONParser parser = new JSONParser();
            Object obj = parser.parse(br);
            JSONArray list =  (JSONArray) obj;
            iterator1 = list.iterator();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return iterator1;
    }
    public JSONObject bringObjectFromJsonObject(String data,JSONObject jsonObject) {
        return (JSONObject) jsonObject.get(data);
    }
}
class Music{
    int songId;
    String songUrl;

    public Music(int songId, String songUrl) {
        this.songId = songId;
        this.songUrl = songUrl;
    }
    public Music() {
    }
    public int getSongId() {
        return songId;
    }

    public String getSongUrl() {
        return songUrl;
    }

    @Override
    public String toString() {
        return "Music{" +
                "songId=" + songId +
                ", songUrl='" + songUrl + '\'' +
                '}';
    }
}

