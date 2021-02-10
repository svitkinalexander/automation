//        Задача 4 (на цикл do...while, остаток от деления и условия)
//        Создайте программу, вычисляющую и выводящую на экран сумму цифр трехзначного числа.
//        Для этого нужно:
//        а. запросить у пользователя именно трехзначное число: использовать цикл do...while,
//        повторять его до тех пор, пока введенное число не будет трехзначным;
//        б. определить в числе количество сотен, количество десятков и количество единиц;
//        в. найти их сумму и передать в консоль, используя форматированный вывод.

import java.util.Scanner;

public class automation4 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int i;
        do {
            System.out.println("Введи 3-х значное число");
            i = in.nextInt();
        }
        while(i < 100 || i > 999);
        System.out.println(i);
        int a = i/100;
        int b = i%100/10;
        int c = i%10;
        int sum = a + b + c;
        System.out.println("Количество сотен:" + a);
        System.out.println("Количество десятков:" + b);
        System.out.println("Количество едениц:" + c);
        System.out.printf("Сумма разрядов: %d", sum);
    }
}
