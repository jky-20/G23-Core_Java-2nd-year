import java.util.Scanner;

public class good_substring {
    static boolean goodSubstring(String str, int si, int ei){
        while (si <= ei) {
            if(str.charAt(si) != 'a' || str.charAt(si) != 'e' || str.charAt(si) != 'i' 
                || str.charAt(si) != 'o' || str.charAt(si) != 'u'){
                    return false;
            }
            si++;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int max_len = 0;
        for(int si=0 ; si<str.length()-1 ; si++){
            for(int ei=si ; ei<str.length()-1 ; ei++){
                if(goodSubstring(str, si, ei)){
                    int len = ei - si + 1;
                    if(len > max_len){
                        max_len = len;
                    }
                }
            }
        }
        System.out.println("Length of longest good substring is : " + max_len);
    }
}
