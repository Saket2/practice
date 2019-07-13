import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindingDuplicate<T> {

    public Map<T, Integer> FindRepititions(List<T> list){

        Map<T, Integer> hmap =   new HashMap<T, Integer>();

        // Traverse through the given list
        for (T element : list)
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
        Map<T, Integer> ReturnHmap =   new HashMap<T, Integer>();
        for (Map.Entry m:hmap.entrySet()) {
            int x = (int) m.getValue();
            System.out.println("Number " + m.getKey() +
                    " is matching totally " + m.getValue() + " times");

        }
    return hmap;

    }
}
