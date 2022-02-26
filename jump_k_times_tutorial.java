/*
Question jump of cursor with n times repeated for k times

input: 7 4 3
eg: initial 7  moves 4 times on jumping repeated for 3 times
the answer will be

output:
7 11 15
 */

import java.util.Scanner;
public class jump_k_times_tutorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int step,n,k;
        step = in.nextInt();
        n = in.nextInt();
        k = in.nextInt();
        
        for (int i = 0;i < k;i++){
            System.out.print(step+" ");
            step = step+n;
        }
    }
}
