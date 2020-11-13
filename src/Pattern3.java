import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        int x = 3, y = 4;
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of row");
        int row = sc.nextInt();
        int column = 2*row-1;
        for (i=1; i<=row; i++){
            for (j=1; j<=column; j++){
                if (j>=row+1-i && j<=row-1+i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
