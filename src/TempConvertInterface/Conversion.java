/*Задача 13. Интерфейсы. Конвертер температур
        Напишите два класса, имплементирующие интерфейс TempConvertInterface.Converter,
        для конвертации из градусов по Цельсию в Кельвины и Фаренгейты.
        У классов должен быть (переопределенный) метод (интерфейса) convert, который и выполняет конвертацию:
        Кельвины = Цельсий + 273.15
        Фаренгейты = Цельсий х 1.8 + 32
        Создайте класс Conversion, в котором запросите у пользователя температуру и
        выведите в консоль ее значение по Кельвину и Фаренгейту.*/

package TempConvertInterface;
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