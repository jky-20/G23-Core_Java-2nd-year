package Strings;
import java.util.Scanner;

public class palindrome_substrings {

    static boolean check_palindrome(String str){
        for(int si=0, ei=str.length() ; si<ei ; si++, ei--){
            if(str.charAt(si) != str.charAt(ei)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cnt = 0;
        for(int si = 0 ; si < str.length() ; si++){
            for(int ei = si+1 ; ei <= str.length() ; ei++){
                if(check_palindrome(str.substring(si, ei))){
                    cnt++;
                }
            }
        }
        System.out.println("Total palindrome substrings is : " + cnt);
    }
}
