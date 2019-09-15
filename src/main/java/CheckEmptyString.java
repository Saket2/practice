//import saket.practice.CheckingEmptyString;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class CheckEmptyString {

    public static void main(String[] args){
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        boolean status=StringUtils.isEmpty(S);
        String S1= StringUtils.strip(S);
        System.out.println(status);
        
        System.out.println(S1);
        System.out.println(S);
        boolean Check2 = StringUtils.equals(S,S1);
        System.out.println(Check2);
        
    }
}

