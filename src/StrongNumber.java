public class StrongNumber {

    public static void main(String []args){
        int num = 145;
        int sum = 0, temp = num;

        while (temp >0){
            int r = temp % 10;
            sum = sum + factorial(r);
            temp = temp/10;
        }
        if (sum == num){
            System.out.println(num + " is a Strong number");
        }else {
            System.out.println(num + " is not a Strong number");
        }
    }

    private static int factorial(int digit){

        int result = 1;
        while (digit>1){
            result = result*digit;
            digit--;
        }

        return result;
    }


}
