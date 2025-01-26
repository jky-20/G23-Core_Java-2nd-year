package Array_2D;
import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[3];
        
        // System.out.println(arr[0]);

        arr[0][1] = 1;

        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=0 ; j<arr[i].length ; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // jagged array
        int n = sc.nextInt();
        int[][] arr_2d = new int[n][];

        for(int i=0 ; i<arr_2d.length ; i++){
            arr_2d[i] = new int[i+1];
        }

        for(int i=0 ; i<arr_2d.length ; i++){
            for(int j=0 ; j<arr_2d[i].length ; j++){
                arr_2d[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<arr_2d.length ; i++){
            for(int j=0 ; j<arr_2d[i].length ; j++){
                System.out.print(arr_2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
