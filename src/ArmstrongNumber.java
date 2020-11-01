import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String []args){
        int number = 407;
        System.out.println("Is number a Armstrong Number "+isArmstrongnumber(number));


    }

    private static boolean isArmstrongnumber(int number){
        boolean result;
        int sum = 0, temp = number;
        while (temp>0){
            int r = temp%10;
            sum = sum + (int)Math.pow(r,3);
            temp = temp/10;
        }
        result = sum == number;
        return result;
    }
}
