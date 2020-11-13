public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1000));
    }

    private static int binaryToDecimal(int binary){
        int result = 0, i=0;
            while (binary>0){
                int r = binary%10;
                result = result +  r*(int)Math.pow(2,i);
                i++;
                binary = binary/10;
            }
        return result;
    }
}
