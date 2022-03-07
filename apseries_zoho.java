/**
 Find the next number in the AP series
 input : 5
         5 7 9 11 13
 output : 15

 idea :
 find d (difference) between the first 2 terms and add the difference with the last term

 Time complexity : 0(n) //for just getting arrays
 */



import java.util.Scanner;
public class apseries_zoho {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int diff = arr[1] - arr[0];
        System.out.println(arr[n-1]+diff);
    }
}
