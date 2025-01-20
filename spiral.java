import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //spiral pattern
        int row_s = 0, row_e = n-1, col_s = 0 , col_e = m-1;
        
    }
}
