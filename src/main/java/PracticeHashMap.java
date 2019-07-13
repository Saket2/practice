import java.util.HashMap;
import java.util.Map;

public class PracticeHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> hmap =   new HashMap<String, Integer>();
        hmap.put("a",1);
        hmap.put("b",2);
        hmap.put("b",3);
        hmap.put("c",2);
        System.out.println(hmap.size());
        //hmap.clear();
        System.out.println(hmap);
        System.out.println(hmap.get("c"));
        System.out.println(hmap.isEmpty());
        System.out.println(hmap.containsKey("a"));
        System.out.println(hmap.containsValue(2));
        for(Map.Entry m : hmap.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }


}
