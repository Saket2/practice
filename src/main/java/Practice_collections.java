import java.util.ArrayList;
import java.util.Iterator;

public class Practice_collections {

    public static void main(String args[]){
        ArrayList<String> Test = new ArrayList<String>();
        Test.add("Saket");
        Test.add("Saket1");
        Test.add("Saket2");
        Test.add("Saket1");
        Iterator itr = Test.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
