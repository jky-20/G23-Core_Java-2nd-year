package Lec_35_Feb_25_OOPs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class KeyValue{
    int key;
    int val;
    KeyValue(int key, int val){
        this.key = key;
        this.val = val;
    }
    @Override
    public String toString(){
        return ("Key : " + key + " || Value : " + val);
    }
}

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<KeyValue> arrList = new ArrayList<>();
        KeyValue[] arr = new KeyValue[n];

        for(int i=0 ; i<n ; i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            arrList.add(new KeyValue(key, val));
            arr[i] = new KeyValue(key, val);
        }

        arrList.sort((obj1, obj2)->Integer.compare(obj2.val, obj1.val));    // arraylist
        Arrays.sort(arr, (obj1, obj2)->Integer.compare(obj2.val, obj1.val));    // arr

        System.out.println("----------- Array --------------");
        for(KeyValue kv : arr){
            System.out.println(kv);
        }
        System.out.println("----------- ArrayList --------------");
        for(KeyValue kv : arrList){
            System.out.println(kv);
        }
    }
}
