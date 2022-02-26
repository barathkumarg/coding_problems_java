/*
Question: Retrieve the sum of min and max of the character i the string array

input: aAkliP
output: 173

Time complexity : 0(n)
 */

import java.util.Scanner;
public class sum_min_maxascii_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Input string
        String str;
        str = in.next();

        int min = (int) str.charAt(0);
        int max = (int) str.charAt(0);

        for (int i=1;i<str.length();i++){
            if (min>(int) str.charAt(i))//MIN CHECK
                min = (int) str.charAt(i);
            if (max<(int)str.charAt(i))
                max = (int) str.charAt(i);//MAX CHECK
        }
        System.out.println(min+max);


    }
}
