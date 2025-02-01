package Lec_16_Jan_17_Strings;
import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("abc");
        String st = new String("abc");

        // append
        str.append("null"); // string builder
        System.out.println(str);
        st = st.concat("null"); // string
        System.out.println(st);
    }
}
