/*Задача 14. Абстрактные классы. Конвертер температур
        Решить Задачу 13 при помощи абстрактных классов.*/

package TempConvertAbstract;

import java.util.Scanner;

public class Conversion{

    public static double enterValue(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру по Цельсию");
        return in.nextDouble();
    }
    public static void main (String[] args)
    {
        FahrenheitConverter t1 = new FahrenheitConverter();
        KelvinConverter t2 = new KelvinConverter();
        double c = enterValue();
        double a = t1.convert(c);
        System.out.printf("Температура в Кельвинах %.2f \n", a);
        double b = t2.convert(c);
        System.out.printf("Температура в Фаренгейтах %.2f", b);
    }
}
