import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int x = 3, y = 4;
        int i, j, num, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int input = sc.nextInt();
        System.out.println("Start from");
        num= sc.nextInt();
        for (i=1; i<=input; i++){
            for (j=1; j<=i+count; j++){
                if (j%2==0) {
                    System.out.print("*");
                }else {
                    System.out.print(num + "");
                }

            }
            num++;
            count++;
            System.out.println();
        }
        num--;
        count--;
        for (i=1; i<=input; i++){
            num--;
            count--;
            for (j=1; j<=input-i+count; j++){
                if (j%2==0) {
                    System.out.print("*");
                }else {
                    System.out.print(num + "");
                }
            }
            System.out.println();
        }
    }
}
