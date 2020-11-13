public class Demo {
    public static void main(String[] args) {
        Q q = new Q(12,23);
    }
}

abstract class P{
    private int a,b;
     P(int a, int b){
        this.a = a;
        this.b = b;
    }

     void display(){
        System.out.println("a="+a + "  b="+b);
    }
}

class Q extends P{
    public Q(int a, int b){
        super(a,b);
        display();
    }
}
