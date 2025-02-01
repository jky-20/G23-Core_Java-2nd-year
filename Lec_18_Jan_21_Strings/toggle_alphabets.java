package Lec_18_Jan_21_Strings;
import java.util.*;

public class toggle_alphabets {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for(int i=0 ; i<sb.length(); i++){
            char c = sb.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = ((char)(c - 'a'));
                c = ((char)(c + 'A'));
            }
            if(c >= 'A' && c <= 'Z'){
                c = ((char)(c - 'A'));
                c = ((char)(c + 'a'));
            }
            sb.setCharAt(i, c);
        }
        str = sb.toString();
        System.out.println(str);
    }
}
