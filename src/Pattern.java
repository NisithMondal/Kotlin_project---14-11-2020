import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int x = 3, y = 4;
        int i, j, num = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int input = sc.nextInt();
        for (i=1; i<=input; i++){
            for (j=1; j<=i; j++){
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
        num--;
        for (i=1; i<=input; i++){
            num--;
            for (j=1; j<=input-i; j++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
