public class SumOfDigits {
    public static void main(String[] args) {
        long  result = sumOfDigits(-12);
        System.out.println(result);

    }
    private static long sumOfDigits(int number){
        long sum = 0;
        int r;
        while (number>0){
            r = number%10;
            sum = sum + r;
            number = number/10;
        }
        return sum;
    }
}
