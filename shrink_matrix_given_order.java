/*
question folding of the matrix
add first and last row , first and last column still you achieve the single row,column

time complexity -> 0(n^2)
space complexity -> 0(N)
 */

import java.util.Arrays;
import java.util.Scanner;
public class shrink_matrix_given_order {


    public static int[][] rowadd(int[][] arr){
        int [][] ans = new int[arr.length -1][arr[0].length];
        //copy expect the fisrt and last row
        for (int i = 0 ;i<ans.length;i++) {
            for (int j = 0; j < ans[0].length; j++) {
                  if (i == ans.length-1){
                      ans[i][j] = arr[0][j]+arr[i+1][j];
                  }
                  else{
                      ans[i][j] = arr[i+1][j];
                  }
            }
        }
        return ans;
    }



    public static int[][] coladd(int[][] arr){
        int [][] ans = new int[arr.length][arr[0].length-1];
        //copy expect the column s expect the add of first and last in first resultant column
        for (int i = 0 ;i<ans.length;i++) {
            for (int j = 0; j < ans[0].length; j++) {
                if (j == 0){
                    ans[i][j] = arr[i][0]+arr[i][arr[0].length -1];
                }
                else{
                    ans[i][j] = arr[i][j];
                }
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        // inputs matrix order, ans order
        int n,m;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        m= in.nextInt();
        int [][] matrix = new int[n][n];

        //getting inputs
        for (int i=0;i<n;i++){
            for (int j=0; j<n;j++){
                matrix[i][j] = in.nextInt();
            }
        }

        //actual row and column operation
        while(n>m){
            matrix = rowadd(matrix);
            matrix = coladd(matrix);
            n--;
        }
        System.out.println(Arrays.deepToString(matrix));


    }
}
