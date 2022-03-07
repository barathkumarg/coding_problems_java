/*
sort the array by even num in descending odd at ascending with odd first and even second

-->input
7
0 4 5 3 7 2 1

-->output
[7, 5, 3, 1, 0, 2, 4]

time complexity -> 0(n^2)

 */
import java.util.Arrays;
import java.util.Scanner;
public class sort_odd_descend_even_ascending {
    private static int[] sort(int[] arr) {
        //selection sort
        int min;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j =i+1;j<arr.length;j++){
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }



    //order odd and even
    public static int[] order(int[] arr){
        int count = 0;
        int i = arr.length - 1;
        while(i>count){
            if (arr[i]%2!=0)
            {
                for (int j=i;j>count;j--){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
                count++;
            }
            else{
                i--;
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int []arr = new int[n];

        //getting array input
        for (int i=0;i<n;i++)
            arr[i] = in.nextInt();
        //calling sort and reorder method
        order(sort(arr));
        System.out.println(Arrays.toString(arr));

    }


}
