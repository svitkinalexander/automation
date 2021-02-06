//Задача 3 (на циклы for и for(each))
//        Элементы массива, которые меньше среднего арифметического, умножить на два.
//        Для этого нужно:
//        а. объвить массив arr размером 10 элементов;
//        б. запросить у пользователя ввод целочисленных значений элементов массива arr в цикле;
//        в. вывести исходный массив arr в консоль;
//        г. объявить переменную sum;
//        д. найти сумму элементов массива arr, используя цикл for(each);
//        е. объявить переменную avg и вычислить среднее арифметическое элементов массива;
//        ж. в цикле for (обычном) умножить на 2 все элементы массива arr, которые меньше среднего арифметического;
//        з. вывести итоговый массив arr в консоль.

import java.util.Arrays;
import java.util.Scanner;

public class automation3 {
    public static void main(String args[]) {
        int[] arr = new int[10];
        int n = arr.length;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int l : arr){
            sum += l;
        }
        System.out.println("Sum:" + sum);
        int avg = 0;
        avg = sum / n;

        System.out.println("Average:" + avg);
        for (int i = 0; i < n; i++) {
            if (arr[i] < avg){
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
