package Collection;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String,Integer> phn= new HashMap<>();
        phn.put("name",90982442);
        phn.put("ravi",71931090);
        System.out.println(phn.get("ravi"));
    }
}
