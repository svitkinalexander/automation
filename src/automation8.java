/*Задача 8
        Решить задачу 3, выделив в чистый метод поиск суммы цифр трехзначного числа.*/

import java.util.Scanner;

public class automation8 {

    static int i, a, b, c, sum;

    public static int setArr(){
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Введи 3-х значное число");
            i = in.nextInt();
        }
        while(i < 100 || i > 999);
        return i;
    }
    public static int getSum(int i){
        a = i/100;
        b = i%100/10;
        c = i%10;
        sum = a + b + c;
        /*System.out.println("Количество сотен:" + a);
        System.out.println("Количество десятков:" + b);
        System.out.println("Количество едениц:" + c);*/
        return sum;
    }

    public static void main (String args[]){
        setArr();
        System.out.println("3-х значное число: " + i);
        getSum(i);
        System.out.printf("Сумма разрядов этого числа: %d", sum);
    }
}