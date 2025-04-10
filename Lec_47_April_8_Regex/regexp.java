package Lec_47_April_8_Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;;

public class regexp {
    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("[^abc]","a"));
        System.out.println(Pattern.matches("[a-g]","h"));
        System.out.println(Pattern.matches("[abc]+","aaaa"));   // atleast once
        System.out.println(Pattern.matches("[abc]*","d"));  // 0 or more
        System.out.println(Pattern.matches("[abc]{2}","aaaa"));
        System.out.println(Pattern.matches("[abc]{2,}","aaaa"));
        System.out.println(Pattern.matches("[abc]{3,7}","aaaa"));
        System.out.println(Pattern.matches("[abc]?","aaaa"));
        System.out.println(Pattern.matches("//bstr//b","str"));
        
        System.out.println(Pattern.matches("^[abc][d-z]+","adeffghj"));
    }
}
