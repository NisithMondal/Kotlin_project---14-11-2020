public class primeNumber {
    public static void main(String[] args) {
        boolean isPrime;
        int []result = new int[15];
        int index = -1;
        for (int number = 2; number<=25; number++) {
            isPrime = true;

            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                index++;
                result[index] = number;

            }

        }

        for (int i = 0; i<=index; i++) {
            System.out.print(result[i] + "  ");
        }
    }
}
