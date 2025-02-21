package Lec_33_Feb_20_OOPs;

public class wrapper_class {
    public static void main(String[] args) {
        
        Integer a = 10;     // default conversion from primitive to wrapper class
        int b = new Integer(10);

        b = Integer.parseInt("1234");
        System.out.println(b);

        String str = Integer.toString(b);
        System.out.println(str);

        int d = Integer.parseInt("101010", 2);  // converts binary string to decimal
        
        str = Integer.toBinaryString(d);
        System.out.println(Integer.max(10, 20));
        System.out.println(Integer.min(10, 20));

        char ch = 'a';
        Character.isLowerCase(ch);   // return true/false if between 'a' to 'z'
        Character.isUpperCase(ch);  // check if in range 'A' to 'Z'
        Character.isLetter(d);  // check if alphabet
        Character.isDigit(ch);  // check if '0' to '9'
        Character.toUpperCase(ch);
    }
}
