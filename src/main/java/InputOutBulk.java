import java.util.ArrayList;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class InputOutBulk {

    public static void main(String[] args) {
        //Provide an input for number of integers to be generated
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();

        //Start time is noted down
        long startTime = System.nanoTime();

        //Random number generator
        Random rand = new Random();
        List<Student> list = new ArrayList<>();
        Student Saket1 = new Student("Saket1",10, "Physics");
        Student Saket2 = new Student("Saket2",20, "Math");
        Student saket3 = new Student("Saket2",20, "Math");
        list.add(Saket1);
        list.add(Saket2);
        list.add(saket3);
//        for(int i=0;i<a;i++){
//        String rand_int1 = String.valueOf(rand.nextInt(10));
//        list.add(rand_int1);
//    }
        System.out.println(list);//to check the list generated

        FindingDuplicate operation = new FindingDuplicate();
        operation.FindRepititions(list);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time taken in nano seconds : "+totalTime);

    }
}






