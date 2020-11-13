public class RemoveDuplicate {
    public static void main(String[] args) {
        int []input = {1,2,3,22,33,33,2,3,1,1,10,10,10,200,200};
        int i,j;
        for (i = 1; i<=input.length - 1; i++){
            for (j=0; j<=input.length - i-1; j++){
                if (input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;

                }
            }
        }

        for (int x : input){
            System.out.print(x + " ");
        }
        System.out.print("\n");
        //After Sorting
        for (i = 0; i<= input.length - 2; i++){
            if (input[i] != input[i+1]){
                System.out.print(input[i] + " ");
            }
        }
        //To print last number of the array
        System.out.print(input[i] + " ");
    }
}
