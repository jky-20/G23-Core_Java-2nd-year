package Lec_10_Dec_20_array;
import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        for(int i=0 ; i<=n ; i++){
            arr[i] = sc.nextInt();
        }

        int[] freq = new int[n+1];
        
        for(int i=0 ; i<=n ; i++){
            freq[arr[i]]++;
        }
        //traversing in array
        for(int i=0 ; i<=n ; i++){
            if(freq[arr[i]] == 2){
                System.out.println(arr[i]);
                break;
            }
        }
        // traversing in freq array
        for(int i=1 ; i<=n ; i++){
            if(freq[i] == 2){
                System.out.println(i);
                break;
            }
        }

        // O(N) without extra space

        int sum_n = (n*(n+1))/2;
        int sum_arr = 0;
        for(int i=0 ; i <= n ; i++){
            sum_arr += arr[i];
        }
        int ans = sum_arr - sum_n;
        System.out.println(ans);
    }
}
