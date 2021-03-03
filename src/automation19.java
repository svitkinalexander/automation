/*Задача 19. Коллекции. Отображения HashMap. Поменять ключи и значения в отображении Map
        Напишите метод, который получает на вход отображение HashMap и
        возвращает новое отображение HashMap, где ключи и значения обращены местами.
        Нужно:
        а. создать отображение initialMap типа HashMap;
        б. наполнить отображение initialMap 10 элементами с ключами, равными 0...9, и значениями,
        равными ключу, умноженному на 2;
        в. вывести на консоль отображение initialMap;
        г. создать метод inverse, который принимает в качестве аргумента отображение типа HashMap,
        меняет местами ключи отображения и его значения и возвращает отображение resultMap типа HashMap;
        д. в методе main вывести на консоль отображение, полученное вызовом метода inverse,
        в которое было передано отображение initialMap.
        Задача 20 - отсортировать результат*/

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class automation19 {
    public static void main (String[] args){
        HashMap<Integer, Integer> initialMap = new HashMap<>();
        TreeMap<Integer, Integer> resultMap = new TreeMap<>();
        fillMap(initialMap);
        resultMap = inverse(initialMap, resultMap);
        System.out.println(resultMap);
    }

    public static void fillMap(HashMap<Integer,Integer> initialMap){
        for (int i = 0; i < 10;i++){
            initialMap.put(i,i*2);
        }
        System.out.println(initialMap);
    }

    public static TreeMap<Integer, Integer> inverse(HashMap<Integer,Integer> initialMap, TreeMap<Integer,Integer> resultMap){
        Set<Integer> keyS = initialMap.keySet();
        for(int key : keyS){
            int val = initialMap.get(key);
            resultMap.put(val, key);
        }
        return resultMap;
    }
}
