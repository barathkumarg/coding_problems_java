//permutation in number with sum of smaller and larger
/*

return the sum of min and max of permuatate number
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sum_of_min_max_permuate_number {
    private static ArrayList<Integer> permutate(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(p));
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutate(up.substring(1),f+ch+s));
        }
        return ans;
    }



    public static void main(String[] args) {
        int num = 734;
        String num1 = Integer.toString(num);
        ArrayList<Integer> list  = new ArrayList<>();
        list = permutate(num1,"");
        System.out.println(Collections.min(list) + Collections.max(list));
    }

}
