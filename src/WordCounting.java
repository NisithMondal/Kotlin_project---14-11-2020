import java.util.Scanner;
public class WordCounting {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        input = " " + input;
        int count = 0;
        for (int i= 0; i<=input.length()-2; i++){
            if (input.charAt(i) == ' ' && input.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("Total number of words is " + count);
    }
}
