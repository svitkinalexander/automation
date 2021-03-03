/*Задача 18. Коллекции. Множество TreeSet. Уникальные наборы цветов шариков
Решить Задачу 17 таким образом, чтобы четыре сформированных набора были уникальны, т.е. не повторялись между собой.*/

import java.util.HashSet;
import java.util.TreeSet;

public class automation18 {
    public static final String[] arr = {"red","orange","yellow","green","cyan","blue","purple"};
    public static void main(String[] args) {
        HashSet<TreeSet> myHashSet = new HashSet<>();
        while(myHashSet.size()<4){
            myHashSet.add(setIn());
        }
        System.out.println(myHashSet);
    }

    public static int mathRandom(int max, int min)
    {
        return (int) (Math.random() * (max - min) + min);
    }

    public static TreeSet<String> setIn() {
        TreeSet<String> myTreeSet = new TreeSet<>();
        while (myTreeSet.size() < 3) {
            int random = mathRandom(6, 0);
            String randomS = arr[random];
            myTreeSet.add(randomS);
        }
        return myTreeSet;
    }
}
