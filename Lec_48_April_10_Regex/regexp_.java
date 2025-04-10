package Lec_48_April_10_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp_ {
    public static void main(String[] args) {
        
        String str = "Today's date is 10th April 2025 next year is 2026";
        String reg = "\\d{4}";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);

        while(m.find()){
            System.out.print(m.group());
            System.out.println(" || Start : " + m.start() + " || end : " + m.end());
        }

        String replaced = m.replaceAll("####");
        System.out.println(replaced);

        str = "Today's date is 10-04-2025";
        reg = "(\\d{2})-(\\d{2})-(\\d{4})";
        p = Pattern.compile(reg);
        m = p.matcher(str);

        if(m.find()){
            System.out.println("Date : " + m.group(1));
            System.out.println("Month : " + m.group(2));
            System.out.println("Year : " + m.group(3));
        }
    }
}
