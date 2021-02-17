/*
Задача 15. Списки Удаление из списка а) Создать список целых чисел и запросить у пользователя ввод 7-10 чисел;
б) Вывести исходный список на консоль; б) Запросить пользователя одно число, которое нужно удалить из списка;
в) Удалить из списка все вхождения заданного к удалению числа; г) Вывести конечный список на консоль.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class automation15 {

    public static void main (String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        enterList(numbers);
        System.out.println(numbers);
        int c = enterValue();
        System.out.println("Число которое, мы хотим удалить: " + c);
        removeValue(numbers, c);
        System.out.println("Конечный список:" + numbers);
    }
    public static ArrayList<Integer> enterList(ArrayList<Integer> numbers){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа списка");
        for (int i=0; i < 7; i++){
            int a = in.nextInt();
            numbers.add(a);
        }
        return numbers;
    }
    public static int enterValue(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число из списка, которое вы хотите удалить");
        return in.nextInt();
    }
    public static void removeValue(ArrayList<Integer> numbers, int c){
        while (numbers.contains(c)) {
            numbers.remove(Integer.valueOf(c));
        }
    }
}
