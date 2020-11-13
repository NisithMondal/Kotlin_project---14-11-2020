public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(3));
    }

    private static int decimalToBinary(int decimal){
        int result = 0, i=1;
            while (decimal>0){
                int r = decimal%2;
                result = result +  r*i;
                i = i*10;
                decimal = decimal/2;
            }
        return result;
    }
}
