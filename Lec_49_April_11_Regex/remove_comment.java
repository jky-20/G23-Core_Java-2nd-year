package Lec_49_April_11_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class remove_comment {
    public static void main(String[] args) {
        
        String str = "System.out.print(\"Hello\")   // prints Hello";
        String reg = "//.*";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);

        str = m.replaceAll("");
        System.out.println(str);
    }
}
