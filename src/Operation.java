import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Operation {

    static void operate(List<Integer> list){

        // TODO : Use interface type
        HashMap<Integer, Integer> hmap =   new HashMap<Integer, Integer>();


        // Traverse through the given list
        for (int i = 0; i < list.size(); i++)
        {

            // TODO : Use a list iterator
            // TODO : or use foreach
            Integer c = hmap.get(list.get(i));

            // If this is first occurrence of element
            // TODO Don't use null. Try 'contains'
            if (hmap.get(list.get(i)) == null)
                hmap.put(list.get(i), 1);

                // If elements already exists in hash map
            else
                hmap.put(list.get(i), ++c);
        }

        // TODO Return the the dup map
        // Print result
        for (Map.Entry m:hmap.entrySet()) {
            int x= (int) m.getValue();
            System.out.println("Number " + m.getKey() +
                    " is matching totally " + m.getValue() + " times");
        }

    }
}
