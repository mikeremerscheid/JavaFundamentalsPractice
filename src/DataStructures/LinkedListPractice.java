package DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

    public static void main(String[] args) {

        //Use ListIterator to travel backward through the list
        LinkedList<String> states = new LinkedList<>();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Alaska");
        states.add("Alaska");
        states.add("Pennsylvania");
        states.add("Alaska");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");
        states.addFirst("Alabama");

        //Remote all instances of "Alaska"
        while(states.contains("Alaska")){
            states.remove("Alaska");
        }

        System.out.println(states);
        System.out.println(states.getFirst());
        System.out.println(states.getLast());

        //How to iterate
        ListIterator iterator = states.listIterator(states.size());
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }




    }

}
