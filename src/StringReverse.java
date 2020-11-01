import java.io.IOException;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args)
    {
        String str = "CAT MAT FAT";
        char[] chr = str.toCharArray();
        int i,j;
        for (i=1; i<=chr.length-1; i++){
            for (j=0; j<=chr.length-1-i; j++){
                if (chr[j]>chr[j+1]){
                    char temp = chr[j];
                    chr[j] = chr[j+1];
                    chr[j+1] = temp;
                }
            }
        }

        String result = new String(chr);
        System.out.println(result);





    }


}


