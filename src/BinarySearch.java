public class BinarySearch {
    public static void main(String[] args) {

        int []arr = {-4,-3,-1,0,1,20,30,40,50,60,70,80,90,500,700,900,1000}; //array in ascending order.it's mandatery
        int number = 80;
        System.out.println("is present "+isPresent(arr, number));

    }

    private static boolean isPresent(int []arr, int number){
        boolean isPresent = false;
        int startIndex = 0, lastIndex = arr.length-1;
        int midIndex;
        while (startIndex<=lastIndex){
            midIndex = (startIndex + lastIndex)/2;
            int temp = arr[midIndex];
            if (number==temp){
                isPresent = true;
                break;
            }else if (number>temp){
                startIndex = midIndex + 1;
            }else {
                lastIndex = midIndex - 1;
            }
        }
        return isPresent;
    }
}
