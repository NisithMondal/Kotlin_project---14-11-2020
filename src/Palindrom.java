import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp>0){
            int r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;
        }
        System.out.println("Reverse of the number is "+sum);
        if (num == sum){
            System.out.println(num + " is a palindrom number");
        }else {
            System.out.println(num + " is not a palindrom number");
        }
    }
}
