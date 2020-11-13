import java.util.Scanner;
public class MatrixAddition {
    public static void main(String []args){
        //Addition of a 3X3 matrix
        Scanner sc = new Scanner(System.in);
        int [][]mat1 = new int[3][3];
        int [][]mat2 = new int[3][3];
        int [][]result = new int[3][3];
        int i, j;
        System.out.println("Enter first matrix elements");
        //Take first matrix elements from input
        for (i=0; i<mat1.length; i++){
            for (j=0; j<mat1.length; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix elements");
        //Take second matrix elements from input
        for (i=0; i<mat1.length; i++){

        }
        //addition of 'mat1' and 'mat2'
        for (i=0; i<mat1.length; i++){
            for (j=0; j<mat1.length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //Print the resultant Matrix
        for (i=0; i<result.length; i++){
            for (j=0; j<result.length; j++){
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }




    }
}
