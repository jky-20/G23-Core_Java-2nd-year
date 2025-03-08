package Lec_38_Mar_3_Arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        // add elements
        arrList.add(10);    // adds at end of the list
        arrList.add(20);

        arrList.add(1, 30); // add element at the particular index
        System.out.println(arrList);
        // arrList.add(5, 15); // throws error index out of bound
        System.out.println(arrList);

        // replace element at index
        arrList.set(2, 30);

        // access element
        arrList.get(3);

        arrList.contains(10);   // returns true or false is the element is present
        arrList.remove(2);  // remove element at index
        arrList.size(); // returns size

        // for sorting using default comparator
        Collections.sort(arrList);

        // if we use comparator
        arrList.sort((obj1,obj2)->Integer.compare(obj1, obj2));

        // convert arrayList to arrays
        Object[] arr1 = arrList.toArray();  // general type array
        Integer[] arr2 = arrList.toArray(new Integer[0]);   // to specific type array
        
        // to primitive type array
        int[] arr = arrList.stream().mapToInt(Integer::intValue).toArray();
        int[] int_arr = arrList.stream().mapToInt(Integer::intValue).toArray();

        // Array to arrayList
        Integer[] array = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(array);
    }
}
