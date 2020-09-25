package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        var hashMap = new HashMap<Integer,Integer>();

        hashMap.put(1,100);
        hashMap.put(2,45);
        hashMap.put(3,78);
        hashMap.put(4,20);

        hashMap.putIfAbsent(2,79);

        var value = hashMap.getOrDefault(4,0);
        var entries = hashMap.entrySet();

        System.out.println(hashMap);
        System.out.println(entries);
        System.out.println(value);

        var lst1 = new ArrayList<Integer>();
        var lst2 = new ArrayList<Integer>();

        //Iterating over a map
        for(var entry: entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());
            lst1.add(entry.getKey());
            lst2.add(entry.getValue());
        }

        //Printed out fropm an Arraylist
        for (int i = 0; i < lst1.size(); i++) {
            System.out.println(lst1.get(i) + ": " + lst2.get(i));
        }







    }
}
