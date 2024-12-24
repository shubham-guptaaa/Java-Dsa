import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> mpp = new HashMap<>();
        mpp.put("a", 1);
        mpp.put("b", 2);
        mpp.put("c", 3);
        mpp.put("d", 4);
        mpp.put("e", 5);
        System.out.println(mpp);
        // mpp.get("a");
        System.out.println(mpp.get("a"));
        int a = mpp.remove("a");
        System.out.println(a);
        for(Map.Entry<String, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for(var e : mpp.keySet()) {
            System.out.println(e + " " + mpp.get(e));
        }
        
    }
}
