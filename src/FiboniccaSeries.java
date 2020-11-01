public class FiboniccaSeries {
    public static void main(String[] args) {
        int a = 0,b = 1,c;
        int range = 30;
        System.out.println("Fibonicca series is ");
        System.out.print(a + ", "+b+", ");
        for (int i=1; i<=range; i++){
            c = a+b;
            System.out.print(c+", ");
            a = b;
            b = c;
        }
    }
}
