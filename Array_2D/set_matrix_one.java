package Array_2D;
public class set_matrix_one {
    public static void main(String[] args) {
        
        int[][] arr = {{0,0,0},{0,1,0},{0,0,0},{0,0,1}};

        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                if(arr[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0 ; i<row.length ; i++){
            if(row[i] == 1){
                for(int j=0 ; j<arr[i].length ; j++){
                    arr[i][j] = 1;
                }
            }
        }

        for(int j=0 ; j<col.length ; j++){
            if(col[j] == 1){
                for(int i=0 ; i<arr.length ; i++){
                    arr[i][j] = 1;
                }
            }
        }
        
        // int row = -1, col = -1;

        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=0 ; j<arr[i].length ; j++){
        //         if(arr[i][j] == 1){
        //             row = i;
        //             col = j;
        //         }
        //     }
        // }

        // for(int i = 0 ; i<arr[row].length ; i++){
        //     arr[row][i] = 1;
        // }
        
        // for(int i = 0 ; i<arr.length ; i++){
        //     arr[i][col] = 1;
        // }

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
