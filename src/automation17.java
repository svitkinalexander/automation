/*Задача 17. Коллекция Set (Набор)
        Нужно:
        а. создать массив, содержащий в себе названия 7 цветов радуги;
        б. создать генератор случайных чисел (int)(Math.random() * (max - min) + min), выделив его в метод;
        в. используя генератор сформировать четыре разных набора по три разных цвета воздушных шариков в каждом;
        г. вывести на консоль наборы цветов воздушных шариков.*/

import java.util.HashSet;
import java.util.Iterator;

public class automation17 {
    public static final String[] arr = {"red","orange","yellow","green","cyan","blue","purple"};
    public static void main(String[] args) {
        int k=0;
        while(k<4){
            HashSet<Integer> myHashSet = new HashSet<>();
            setIn(myHashSet);
            HashSet<String> myHashSetS = setOut(myHashSet);
            k++;
            System.out.println(myHashSetS);
        }
    }

    public static int mathRandom(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void setIn(HashSet<Integer> myHashSet) {
        while (myHashSet.size() < 3) {
            int random = mathRandom(6, 0);
            myHashSet.add(random);
        }
    }

    public static HashSet<String> setOut(HashSet<Integer> myHashSet) {
        HashSet<String> myHashSetS = new HashSet<>();
            Iterator<Integer> iter = myHashSet.iterator();
            while(iter.hasNext()){
                int temp = iter.next();
                myHashSetS.add(arr[temp]);
            }
        System.out.println('\n');
            return myHashSetS;
    }
}
