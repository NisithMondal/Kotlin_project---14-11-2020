import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Filter {
    public static void main(String []args){
        int []input = {1,2,3,4,5,6,7,8,9,10,11,12};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<input.length; i++){
            int temp = input[i];
            if (temp%2==0){
                even.add(temp);
            }else {
                odd.add(temp);
            }
        }

        result.addAll(even);
        result.addAll(odd);
        for (Integer x: result){
            System.out.print(x + " ");
        }
    }
}
