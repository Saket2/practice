import java.util.ArrayList;
import java.util.*;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class InputOutBulk {

    public static void main(String[] args) {
        //Provide an input for number of integers to be generated
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        //Start time is noted down
        long startTime = System.nanoTime();

        //Random number generator
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<a;i++){
        int rand_int1 = rand.nextInt(10);
        list.add(rand_int1);
    }
        System.out.println(list);//to check the list generated
        operate(list);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time taken in nano seconds : "+totalTime);

    }

    static void operate(List<Integer> list){
    HashMap<Integer, Integer> hmap =   new HashMap<Integer, Integer>();

        // Traverse through the given list
        for (int i = 0; i < list.size(); i++)
        {
        Integer c = hmap.get(list.get(i));

        // If this is first occurrence of element
        if (hmap.get(list.get(i)) == null)
        hmap.put(list.get(i), 1);

        // If elements already exists in hash map
        else
        hmap.put(list.get(i), ++c);
        }
        // Print result
        for (Map.Entry m:hmap.entrySet()) {
            int x= (int) m.getValue();
            System.out.println("Number " + m.getKey() +
                    " is matching totally " + result(x-1) + " times");
        }

    }

    static int result(int n){
        int temp=n;
        for(int j=n-1;j>0;j--){
            temp=temp+j;
        }
    return temp;
    }
}






