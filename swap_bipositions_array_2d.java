//Question Swap the elements in matrix in bipositional way in row order eg in given below problem swap matrix[0][0] with matrix[0][4]
//matrix[1,2] with matrix[1][3] etc.
/* input
5 5 -> row,column
->matrix
8 2 8 5 3
1 5 3 8 2
3 6 9 1 0
2 4 6 8 1
4 7 5 1 9

->output
3 2 8 5 8
1 8 3 5 2
3 6 9 1 0
2 8 6 4 1
9 7 5 1 4

Time complexity n^2
 */


import java.util.Arrays;
import java.util.Scanner;
// matrix swap by row and columns
public class swap_bipositions_array_2d {
    //swap operation
    public static void swap(int[][] matrix){
        int i = 0;
        int j = matrix[0].length - 1;

        for (int k = 0; k<matrix.length;k++){
            //swap function
            int temp = matrix [k][i];
            matrix[k][i] = matrix[k][j];
            matrix[k][j] = temp;
            //incrementing the pointers
            i++;
            j--;
        }
    }




    public static void main(String[] args) {
        int row,col;
        //intput row,column
        Scanner in = new Scanner(System.in);
        row= in.nextInt();
        col = in.nextInt();

        //int array input
        int[][] matrix = new int[row][col];
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        swap(matrix); //swap matrix function

        //printing the matrix
        for (int i = 0; i<row;i++){
            for (int j = 0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }

}
