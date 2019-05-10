import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class InputOutBulk {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10000;i++){
        int rand_int1 = rand.nextInt(10);
        list.add(rand_int1);
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




