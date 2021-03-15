/*Задача 47. Строки
        Напишите метод, который проверяет является ли слово палиндромом.*/

import java.util.Scanner;

public class automation47 {
    public static void main(String[] args) {
        String str1 = enterWord();
        StringBuilder strBuilder = new StringBuilder(str1);
        String str2 = strBuilder.reverse().toString();
        if (str2.equalsIgnoreCase(str1)){
            System.out.println("Это слово является палиндромом");
        } else System.out.println("Это слово НЕ является палиндромом");

    }

    public static String enterWord(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово палиндромом");
        return in.nextLine();
    }

}