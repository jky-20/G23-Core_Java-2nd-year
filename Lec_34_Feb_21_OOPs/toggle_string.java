package Lec_34_Feb_21_OOPs;

public class toggle_string {
    public static void main(String[] args) {
        
        String str = "ac2Bas56Bhj";
        StringBuilder sb = new StringBuilder(str);
        // toggle string using wrapper class methods

        for(int i=0 ; i<str.length() ; i++){
            char ch = sb.charAt(i);
            
            if(Character.isDigit(ch)){
                continue;
            }
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            else{
                ch = Character.toLowerCase(ch);
            }
            sb.setCharAt(i, ch);
        }
        str = sb.toString();
        System.out.println(str);
    }
}
