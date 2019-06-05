import java.util.ArrayList;
import java.util.*;
import java.util.Random;
import java.util.Scanner;


public class InputOutBulk extends Operation {

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

    // TODO : Write this in a seperate class file

}






