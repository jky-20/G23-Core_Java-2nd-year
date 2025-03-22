package Lec_41_Mar_10_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        HashMap<Integer,Boolean> hmap = new HashMap<>();

        int n = sc.nextInt();

        // input List and add elements in the map
        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();
            arrList.add(a);
            hmap.put(a, true);
        }

        int maxLen = 0;
        // traverse the list and check for consecutive elements
        for(int i=0 ; i<arrList.size() ; i++){
            if(!hmap.containsKey(arrList.get(i))){
                continue;
            }
            int cnt = 1;
            int left = arrList.get(i) - 1;
            int right = arrList.get(i) + 1;
            while (hmap.containsKey(left)) {
                cnt++;
                hmap.remove(left);
                left--;
            }
            while (hmap.containsKey(right)) {
                cnt++;
                hmap.remove(right);
                right++;
            }
            maxLen = Math.max(maxLen, cnt);
        }
        System.out.println("length of longest consecutive sequence is : " + maxLen);
    }
}
