/*Задача 21. Коллекции. Ключи, значения, вхождения. Данные о странах.
        Нужно:
        а. создать коллекцию countryMap типа HashMap, куда как "ключи-значения" добавить 4 пары "страна-столица";
        б. создать метод, который выводит ключи коллекции в целом и по одному через итератор;
        в. создать метод, который выводит значения коллекции в целом и по одному через итератор;
        г. создать метод, который выводит вхождения коллекции в целом и по одному через итератор;
        д. создать метод, который выводит вхождения коллекции по парам "ключ-значение".*/

import java.util.*;

public class automation21 {
    public static void main(String[] args) {
        HashMap<String,String> countryMap = new HashMap<>();
        fillMap(countryMap);
        keyOut(countryMap);
        valOut(countryMap);
        enterGeneral(countryMap);
        enterDouble(countryMap);
    }

    public static void fillMap(HashMap<String,String> map){
        map.put("Belarus", "Minsk");
        map.put("France", "Paris");
        map.put("Portugal", "Lisabon");
        map.put("Germany", "Berlin");
        System.out.println("Country Map: " + map);
    }
    public static void keyOut(HashMap<String,String> kMap){
        Set<String> keyS = kMap.keySet();
        System.out.println("Keys: ");
        Iterator<String> iter = keyS.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public static void valOut(HashMap<String,String> vMap){
        Collection<String> valS = vMap.values();
        System.out.println("Values: ");
        Iterator<String > iter = valS.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

    public static void enterGeneral(HashMap<String,String> egMap){
        Set<Map.Entry<String,String>> enterG = egMap.entrySet();
        System.out.println("Key + Value: ");
        Iterator<Map.Entry<String, String>> iter = enterG.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

    public static void enterDouble(HashMap<String,String> edMap){
        Set<Map.Entry<String,String>> enterD = edMap.entrySet();
        System.out.println("Key & Value: ");
        for(Map.Entry<String,String> k : enterD){
            System.out.println(k.getKey() + "  " + k.getValue());
        }

    }

}
