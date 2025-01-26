package Strings;
import java.util.Scanner;

public class string_buffer {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("abcdef");
        
        // append
        sb.append("null");
        System.out.println(sb);

        // length
        sb.length();

        // char at index
        sb.charAt(2);

        // set char
        sb.setCharAt(2, 'd');

        // substring
        sb.substring(3);
        sb.substring(3, 6);

        // delete char
        sb.deleteCharAt(2);

        // delete substring
        sb.delete(3, 6);

        // insert
        sb.insert(2, "abc");

        // replace
        sb.replace(3, 7, "abcdef");

        // equals
        sb.equals(new StringBuffer("abc"));

        // convert string buffer to string
        sb.toString();

        // convert string to string buffer
        String str = "abc";
        StringBuffer sb1 = new StringBuffer(str);
    }
}
