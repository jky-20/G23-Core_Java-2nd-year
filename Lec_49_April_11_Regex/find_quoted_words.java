package Lec_49_April_11_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class find_quoted_words {
    
    public static void main(String[] args){
        
        String str = "Today is \"Friday\" ... \"weekend\" starts!!";
        String reg = "\"(\\w*)\"";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);

        while(m.find()){
            System.out.println(m.group(1));
        }
    }
}
