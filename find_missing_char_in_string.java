/*
find thd character that deleted from the string

-->input

aaaaabaa
aaaaaaa

-->output
b


 */

import java.util.Scanner;

public class find_missing_char_in_string {
    public static char pattern(String a,String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        int length = Math.min(ch1.length, ch2.length);

        for (int i=0; i<length; i++){
            if (ch1[i]!=ch2[i])
                return ch1[i];
        }
        return ch1[ch1.length - 1];

    }
    public static void main(String[] args) {
        //a denotes string
        //b denotes reduced string
        String a,b;
        Scanner in = new Scanner (System.in);
        a = in.next();
        b= in.next();

        System.out.println(pattern(a,b));

    }
}
