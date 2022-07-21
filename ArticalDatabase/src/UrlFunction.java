import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;

public class UrlFunction {
    HashMap<String,String> list=new HashMap<>();

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
    public Iterator jasonObjectToJsonArray(String br){
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
    public HashMap inputtingRequestProperty(String key,String value){
        this.list.put(key, value);
        return list;
    }
    public void httpRequestProcess(HttpURLConnection http, String method, HashMap list){
        try {
            http.setRequestMethod(method);
            list.forEach((key, value) -> http.setRequestProperty((String) key, String.valueOf(value)));
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        }
    }

    public HashMap<String, String> getList() {
        return list;
    }
}
