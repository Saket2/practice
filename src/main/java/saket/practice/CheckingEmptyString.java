package saket.practice;
import java.util.Scanner;

public class CheckingEmptyString {

    public static void main(String[] args){
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        CheckingEmptyString Saket = new CheckingEmptyString();
        boolean status1=Saket.StringChecker(S);
        System.out.println(status1);
    }

    public boolean StringChecker(String Str){
        boolean status = Str.isEmpty();
        System.out.println(status);
    return status;
    }
}
