/*Задача 54. Дженерики
        Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
        где K — значение из массива, а Integer — хэш-код данного значения.
        То есть сигнатура метода выглядит так: public static <K> Map<K, Integer> arrayToHashMap(K[] genericArray){}*/


import java.util.HashMap;
import java.util.Map;

public class automation54 {
    public static void main(String[] args) {
         String [] arr = {"Dad","Mom","Son","Daughter"};
         Map<String, Integer> map2 = arrayToHashMap(arr);
         System.out.println(map2);
         Integer [] map3 = {1,2,3,4};
         Map<Integer, Integer> map4 = arrayToHashMap(map3);
         System.out.println(map4);
    }
    public static <K> Map<K, Integer> arrayToHashMap(K[] genericArray){
        Map<K, Integer> map1 = new HashMap<>();
        for (K k : genericArray){
            map1.put(k,k.hashCode());
        }
        return map1;
    }
}
