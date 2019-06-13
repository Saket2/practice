import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Operation {

    public Map<Integer, Integer> operate1(List<Integer> list){

        Map<Integer, Integer> hmap =   new HashMap<Integer, Integer>();

        // Traverse through the given list
        for (Integer element : list)
        {
            Integer c = hmap.get(element);

            // If this is first occurrence of element
            if (!hmap.containsKey(element))
                hmap.put(element, 1);

                // If elements already exists in hash map
            else
                hmap.put(element, ++c);
        }
        
        // Print result
        Map<Integer, Integer> ReturnHmap =   new HashMap<Integer, Integer>();
        for (Map.Entry m:hmap.entrySet()) {
            int x= (int) m.getValue();
            System.out.println("Number " + m.getKey() +
                    " is matching totally " + m.getValue() + " times");

        }
    return hmap;

    }
}
