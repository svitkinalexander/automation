//Задача 2
//1. Объявить целочисленный массив размером 10 элементов;
//2. Заполнить элементы массива индексами элемента в квадрате (обычный цикл for);
//3. Вывести на консоль все элементы массива,
// при этом те из них, которые делятся на 3 или на 7, заменить на ноль,
// используя цикл for(each)

import java.util.Arrays;

public class automation2 {
    public static void main (String args[]){
        int [] arr = new int[10];
        int n = arr.length;
        for (int i = 0; i < n; i++){
            arr[i]=i*i;
        }
        System.out.println(Arrays.toString(arr));
        for (int l : arr){
            if (l%3 == 0 || l%7 == 0){
                l = 0;
            }
            System.out.print(l + " ");
        }
    }
}
