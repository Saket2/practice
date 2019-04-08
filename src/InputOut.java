import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InputOut {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader in = new BufferedReader(new FileReader(System.getProperty("user.home")+"/Desktop/" + "InputFile1.txt"));
            String str;
            List<String> list = new ArrayList<String>();
            while((str = in.readLine()) != null){
                list.add(str);
            }
            in.close();

            for(int i=0;i<list.size();i++){
                //System.out.println(list.get(i)+"a");
                for(int j=i+1;j<list.size();j++){
                    if(Objects.equals(list.get(i),list.get(j))){
                        System.out.println(list.get(i));
                    }
                }
            }}
        catch(Exception e) {
            System.out.println(e);
        }
    }
}