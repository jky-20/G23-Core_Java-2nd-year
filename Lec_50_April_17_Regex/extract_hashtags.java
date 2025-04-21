package Lec_50_April_17_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extract_hashtags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reg = "#(\\w+)";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);

        while(m.find()){
            System.out.println(m.group(1));
        }
    }
}
