import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i, j;
        System.out.println("Enter five numbers");
        for (i=0; i<5; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Before sort");
        for (i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for (i = 1; i<=arr.length-1; i++){

            for (j = 0; j<=arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println("\nAfter sort");
        for (i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }




    }


}
