package Lec_39_Mar_4_map;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,1,2,3,2,3,4,-2,-3};
        HashMap<Integer,Integer> hmap = new HashMap<>();

        // put -> store key value pair
        // get -> get vlaue of key

        for(int elem : arr){
            if(hmap.containsKey(elem)){
                hmap.put(elem, hmap.get(elem)+1);
            }
            else{
                hmap.put(elem, 1);
            }
        }

        for(var entry : hmap.entrySet()){
            System.out.println("Element : " + entry.getKey() + " || freq : " + entry.getValue());
        }
        for(var entry : hmap.keySet()){
            // gives all keys 
        }
        for(var entry : hmap.values()){
            // gives all values
        }
    }
}
