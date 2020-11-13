import java.io.OutputStream;
import java.util.Scanner;
public class Stack {
   static int topIndex = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        boolean isContinue = true;
        while (isContinue){
            System.out.println("Select your option");
            int x = sc.nextInt();
            switch (x){
                case 0:
                    isContinue = false;
                    break;
                case 1:
                    System.out.println("Enter number");
                    System.out.println(push(arr, sc.nextInt()));
                    break;
                case 2:
                    pop(arr);
                    break;
                case 3:
                    display(arr, topIndex);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

    }
    private static String push(int []arr, int number){
        String message = "Inserted Successfully";
        if (topIndex+1==arr.length){
            message = "Stack is full";
        }else {
            arr[++topIndex] = number;
        }

        return message;
    }

    private static void pop(int []arr){
        int temp = -1;
        if (topIndex != -1){
            System.out.println(arr[topIndex--]);
        }else {
            System.out.println("Stack is empty");
        }
    }

    private static void display(int []arr, int topIndex){
        for (int i = 0; i <=topIndex; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

}
