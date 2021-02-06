//перебрать массив
//поменять 1 символ с последним и т д

import java.io.Console;
import java.util.Arrays;

public class automation1{

    public static void main (String args[]) {
        int[] arrayT = new int[10];
        int[] arrayT1 = new int[10];
        int n = arrayT.length;
        for (int i = 0; i < n; i++) {
            arrayT[i] = i + 1;
        }

        System.out.println(java.util.Arrays.toString(arrayT));
        for (int j = 0; j < arrayT1.length; j++) {
            arrayT1[j] = arrayT[n-1];
            n--;
        }
        System.out.println("\n");
        System.out.println(java.util.Arrays.toString(arrayT1));
    }
}

