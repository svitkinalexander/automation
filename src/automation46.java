/*Задача 46. Строки
        Напишите метод для поиска самой длинной строки в массиве.*/

import java.lang.String;
import java.util.Arrays;

public class automation46 {
    public static void main(String[] args) {
        String [] Str = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int n = Str.length;
        String temp = "";
        int max = 0;
        for (int i=0; i < n; i++){
            if (Str[i].length() > max) {
                temp = Str[i];
                max = Str[i].length();
            }
        }
        System.out.println(temp);
    }
}
