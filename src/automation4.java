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
        int ch;
        do {
            System.out.println("Введи 3-х значное число");
            ch = in.nextInt();
        }
        while(ch < 100 || ch > 999);
        System.out.println(ch);
        int sot = ch/100;
        int dec = ch%100/10;
        int ed = ch%10;
        int sum = sot + dec + ed;
        System.out.println("Количество сотен:" + sot);
        System.out.println("Количество десятков:" + dec);
        System.out.println("Количество едениц:" + ed);
        System.out.printf("Сумма разрядов: %d", sum);
    }
}
