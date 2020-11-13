import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int [][]mat = new int[3][3];
        int i, j;
        System.out.println("Enter elements of the matrix");
        for (i=0; i<mat.length; i++){
            for (j=0; j<mat.length; j++){
                mat[i][j] = sc.nextInt();
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        //Perform Transpose
        for (i=0; i<mat.length; i++){
            for (j=i; j<mat.length; j++){
               int temp = mat[i][j];
               mat[i][j] = mat[j][i];
               mat[j][i] = temp;

            }
        }
        System.out.println("After Transpose");
        for (i=0; i<mat.length; i++){
            for (j=0; j<mat.length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
