public class MyExample
{
    public static void main(String[] args)
    {
        BB b = new BB();
        AA a = b;
        if (a instanceof AA) System.out.println("AA");
        if (a instanceof BB) System.out.println("BB");
        if (a instanceof CC) System.out.println("CC");
        if (a instanceof DD) System.out.println("DD");

    }
    public void hello(){
        try
        {
            int arr[]={1,2};
            arr[2]=3/0;
            System.out.println(arr[0]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by Zero");
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }

    }
}

class AA {}
class BB extends AA {}
class CC extends BB {}
class DD extends CC {}