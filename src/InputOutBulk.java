import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class InputOutBulk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        long startTime = System.nanoTime();
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<a;i++){
        int rand_int1 = rand.nextInt(10);
        list.add(rand_int1);
        //System.out.println(list);
    }
        for(int i=0;i<list.size();i++){
            //System.out.println(list.get(i)+"a");
            for(int j=i+1;j<list.size();j++){
                if(Objects.equals(list.get(i),list.get(j))){
                    System.out.println(list.get(i));
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}




