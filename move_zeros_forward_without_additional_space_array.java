/*
Move the all zeros to front without using extra space with perserving the order

hint: recursive bubble sort approach

time complexity 0(n^2)
 */

import java.util.Arrays;

public class move_zeros_forward_without_additional_space_array {
    private static int[] move_zero(int[] arr, int index, int times) {
        if (index == 0)
            return arr;
        if(index>times){
            if (arr[times+1] == 0) {
                int temp = arr[times];
                arr[times] = arr[times+1];
                arr[times+1] = temp;
            }
            return move_zero(arr,index,times+1);
        }
        return move_zero(arr,index-1,0);

    }


    public static void main(String[] args) {
        int arr [] = {2,0,0,3,4,5};
        System.out.println(Arrays.toString(move_zero(arr, arr.length - 1, 0)));

    }


}
