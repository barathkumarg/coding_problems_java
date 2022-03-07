/**
   Count the 1's in the binary without using the in build function bin
   input: 5
   output :  2

   idea: Convert the given num to binary i,e 5 -> 101 contains 2 1's

  Time complexity = 0(n)
 */


import java.util.Scanner;
public class count_ones_in_binary_zoho {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int digit,count=0;
        while(n>0){
            digit = n%2;
            if (digit == 1)
                count++;
            n=n/2;

        }
        System.out.println(count);
    }
}
