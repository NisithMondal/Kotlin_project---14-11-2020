public class AscendingDecending {
    public static void main(String[] args) {
        int []arr = {60,10,12,3,8,20,45,-200,100,-10};
        int midd = arr.length/2 - 1;
        //First half in ascending order
        for (int i=1; i<=midd; i++){
            for (int j=0; j<=midd-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        //Last half in decending order
        for (int i=1; i <=midd; i++){
            for (int j=midd+1; j<= arr.length-1-i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        for (int x : arr){
            System.out.print(x + " ");
        }

    }
}
