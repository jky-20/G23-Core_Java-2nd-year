import java.util.StringTokenizer;

public class string_tokennizer {
    public static void main(String[] args) {
        
        String str = "My name is Jai";
        StringTokenizer st = new StringTokenizer(str);

        st.countTokens();

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        str = "apple;banana;mango";
        st = new StringTokenizer(str, ":"); // 
        st = new StringTokenizer(str, ";"); //
        st = new StringTokenizer(str, ";", true); // "apple",";","banana",";","mango"
    }
}
