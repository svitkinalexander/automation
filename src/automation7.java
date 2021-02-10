/*Задача 7
        Решить задачу 3, выделив в чистые методы:
        а. поиск суммы элементов массива (входящий параметр - только массив, возвращаемое значение - сумма элементов);
        б. вычисление среднего арифметического элементов массива
        (входящий параметр - массив, возвращаемое значение - среднее арифметическое);
        в. умножение элементов массива, меньших среднего арифметического,
        на два (входящие параметры - массив, среднее арифметическое, множитель; возвращаемое значение - новый массив).*/

import java.util.Arrays;
import java.util.Scanner;

public class automation7{

    static int[] arr = new int[10];
    static int n = arr.length;
    static double sum;
    static double avg;

    public static void setArr(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
    }

    public static double getSum(int[] arr){
        double sum = 0;
        for(int l : arr){
            sum += l;
        }
        return sum;
    }

    public static double getAverage(int[] arr){
        avg = sum / n;
        return avg;
    }

    public static int[] multiplyArr(int[] arr, double avg, int x){
        x = 2;
        for (int i = 0; i < n; i++) {
            if (arr[i] < avg){
                arr[i] *= x;
            }
        }
        return arr;
    }
    public static void main(String args[]) {
        setArr();
        System.out.println("Initial array:" + Arrays.toString(arr));
        sum = getSum(arr);
        System.out.println("Sum:" + sum);
        avg = getAverage(arr);
        System.out.println("Average:" + avg);
        multiplyArr(arr, avg, 2);
        System.out.println("Final array:" + Arrays.toString(arr));
    }
}