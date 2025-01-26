package Strings;
public class strings_demo {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.concat(" World");
        str = "world";
        
        System.out.println(str);

        // length
        // str.length();
        System.out.println(str.length());

        // char
        // str.charAt(2);
        System.out.println(str.charAt(2));

        // substr
        System.out.println(str.substring(1, 4));
        System.out.println(str.substring(1));

        // compare
        str.equals("World");
        System.out.println(str.equals("World"));

        // contains
        // str.contains("wor");
        System.out.println(str.contains("wor"));

        // to upper case
        // str.toUpperCase();
        System.out.println(str.toUpperCase());

        // replace
        System.out.println(str.replace("wor", "WOR"));
    }
}
