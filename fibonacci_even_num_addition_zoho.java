/**
Print the fibbonacci numbers up to given range need to print the sum of even integers
 input : n = 40
 output : 44

 idea :  generate the num upto 44 in fibonocci number
 the series will be 1 1 2 3 5 8 13 21 34
 the even digit sum 2 + 8 + 34 = 44
 generate fibbonacci num and detect is it even and add

 Time complexity : 0(n)
 */


import java.util.Scanner;

public class fibonacci_even_num_addition_zoho {
    public static boolean iseven(int num){
        if (num%2 == 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int current = 1;
        int next = 1;
        int sum = 0;
        while(current <=n){
            if (iseven(current))
                sum = sum+current;
            int temp = current;
            current = next;
            next = temp + next;

        }
        System.out.println(sum);
    }
}
