import java.util.Scanner;

public class MyTest{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        System.out.println("String is "+removeVaoul(input));

    }

    private static String removeVaoul(String input){
        String result = "";

        for (int i = 0; i<input.length(); i++){
            char temp = input.charAt(i);
            if (! (temp=='a'|| temp == 'e' || temp == 'i' || temp == 'o'|| temp == 'u')){
                result = result + temp;
            }
        }
        return result;
    }
}
