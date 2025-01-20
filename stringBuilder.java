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

        // length
        str.length();

        // charge char at index
        str.setCharAt(2, 'a');

        // inert char at index
        str.insert(2, 'a');

        // reverse
        str.reverse();

        // replace substring
        StringBuilder sb = new StringBuilder("hello");
        sb.replace(1, 4, "abcdef");

        // delete substring
        str.delete(0, 0);

        //delete char at index
        str.deleteCharAt(2);

        // convert to string
        str.toString();

        // take input in string builder
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        StringBuilder stb = new StringBuilder(temp);
    }
}
