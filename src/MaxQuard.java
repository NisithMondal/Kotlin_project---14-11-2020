import java.util.Arrays;
import java.util.Scanner;

public class MaxQuard {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int []numbers = new int[6];

        for (int i=0; i<6; i++){
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        long first_4_mul = numbers[0]*numbers[1]*numbers[2]*numbers[3];
        long last_4_mul = numbers[numbers.length-1]*numbers[numbers.length-2]*numbers[numbers.length-3]*numbers[numbers.length-4];

        if (first_4_mul > last_4_mul){
            System.out.println("Max value is "+first_4_mul);
        }else {
            System.out.println("Max value is "+last_4_mul);
        }



    }



}
