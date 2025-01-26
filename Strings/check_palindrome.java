package Strings;
import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();
        boolean is_palindrome = true;
        for(int si=0, ei=str.length()-1 ; si < ei ; si++, ei--){

            if(str.charAt(si) != str.charAt(ei)){
                is_palindrome = false;
                break;
            }
        }

        if(is_palindrome){
            System.out.println("String is Palindrome");
        }
        else{
            System.err.println("String is not Palindrome");
        }
    }
}
