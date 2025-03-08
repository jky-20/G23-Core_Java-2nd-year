package Lec_39_Mar_4_map;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(12);
        arrList.add(13);
        arrList.add(20);
        arrList.add(7);

        int max = arrList.get(0);
        for(int elem : arrList){
            max = Math.max(max, elem);
        }
        System.out.println(max);
        
        // using Collections.max
        max = Collections.max(arrList);
        System.out.println(max);
    }
}
