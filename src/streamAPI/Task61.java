/*Задача 61. Stream API. Числа
        Создать поток из 10 целых чисел величиной от 0 до 100;
        отфильтровать, чтобы в потоке остались числа не больше 50;
        увеличить отфильтрованные числа потока на 10;
        вывести, но не более трех, оставшиеся числа потока на консоль.*/

package streamAPI;

import java.util.stream.Stream;

public class Task61 {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,53,23,45,51,98,76,43,23,50);
        numbers
                .filter(p-> p < 50)
                .map(p->p+10)
                .limit(3)
                .forEach(System.out::println);
    }
}
