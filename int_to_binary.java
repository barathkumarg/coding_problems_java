//question  1 : convert int to binary
/*
Time complexity -> 0(n)
 */
import java.util.Scanner;
public class int_to_binary {

    //convert to binary function
    public static int tobinary(int num) {
        int digit,ans=0;
        while(num>0){
          digit = num%2;
          ans = ans*10+digit;
          num/=2;
        }
        return ans;
    }

    //reverse for the actual binary
    public static int reverse(int num)
    {
        int digit,ans=0;
        while(num>0){
            digit = num%10;
            ans= ans*10+digit;
            num/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num,res;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        res = reverse(tobinary(num));
        System.out.println(res);
    }
}
