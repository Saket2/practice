//import saket.practice.CheckingEmptyString;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class CheckEmptyString {

    public static void main(String[] args){
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        boolean status=StringUtils.isEmpty(S);
        System.out.println(status);
    }
}

