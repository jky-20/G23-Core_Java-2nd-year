public class string_demo2 {
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println("using equals func : " + (str1.equals(str2)));
        System.out.println("Using == operator : " + (str1 == str2));
        
        // inside string pool
        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4);

        // in heap memory
        String str5 = new String("abc");
        String str6 = new String("abc");
        System.out.println(str5 == str6);
    }   
}
