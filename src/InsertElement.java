import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int lastValueIndex = 3;
        System.out.println("Before Inserting");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index number");
        int insertIndex = scanner.nextInt();
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        for (int i=lastValueIndex; i>=insertIndex; i--){
            arr[i+1] = arr[i];
        }
        System.out.println("After Inserting");
        arr[insertIndex] = number;
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


    }
}
