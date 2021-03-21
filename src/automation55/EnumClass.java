/*Задача 55. Перечисления. Кошачьи
        Создать перечисление для животных вида кошачьих.
        Вывести на консоль элементы перечисления и их порядковые номера в перечислении.*/

package automation55;

public class EnumClass {
    public static void main(String[] args) {
        Cats[] cats = Cats.values();
        for (Cats k : cats){
            System.out.println("Вид кошачих '" + k + "' с порядковым номером в перечислении " + k.ordinal());
        }
    }
}
