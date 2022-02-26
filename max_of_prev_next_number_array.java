/* question form an array by taking the max of (initial,previous,next) elements
input : [2,3,4,5,6]

output : [3,4,5,6,6]


Time complexity - 0(n)
 */


import java.util.ArrayList;
import java.util.Arrays;

public class max_of_prev_next_number_array {

    public static int max_two(int a,int b){
        return a>b? a:b;
    }

    public static void main(String[] args) {
        int []arr = {-2,3,-4,-5,-6};
        ArrayList<Integer> ans =new ArrayList<>();
        for (int i =0;i<arr.length;i++){
            if (i==0){
                ans.add(max_two(arr[i],arr[i+1]));
            }
            else if(i==arr.length - 1){
                ans.add(max_two(arr[i],arr[i-1]));
            }
            else{
                ans.add(max_two(arr[i-1],arr[i+1]));
            }
        }
        System.out.println(ans);

    }

}
