/*Задача 56. Перечисления. Месяц
        Создать перечисление месяцев.
        Вывести на консоль название текущего месяца по его номеру:
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue();*/

package automation56;
import java.time.LocalDate;

public class EnumClass {
    enum Month {Jan, Feb, Mar, Apr}

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue();
        Month[] mon = Month.values();
        Month m = mon[month-1];
        System.out.println(m);
    }
}
