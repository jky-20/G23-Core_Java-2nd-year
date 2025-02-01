package Lec_19_Jan_23_Strings;
import java.util.Scanner;

public class palindrome_substrings_optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ans = 0;

        // for odd substrings
        for(int i=0 ; i<str.length() ; i++){
            for(int l=i, r=i ; l>=0 && r<=str.length() ; l--, r++){
                if(str.charAt(l) != str.charAt(r)){
                    break;
                }
                ans++;
            }
        }

        // for even substrings
        for(int i=0,j=1 ; j<str.length() ; i++,j++){
            for(int l=i, r=j ; l>=0 && r<=str.length() ; l--, r++){
                if(str.charAt(l) != str.charAt(r)){
                    break;
                }
                ans++;
            }
        }
        System.out.println("Total palindrome substrings is : " + ans);
    }
}
