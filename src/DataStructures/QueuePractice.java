package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

    //Queue is a first in first out (FIFO) data structure
    //add used to add elements to the end
    //peek returns a copy of the first element
    //remove removes the top element, error if empty
    //poll removes from the top, returns null if the queue is empty

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //fill the queue with integers
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        System.out.println("Element in the queue" + queue);

        //removes the first element (zero)
        int removed = queue.remove();
        System.out.println(removed + " was removed");

        //See the top (first in first out) element
        int top = queue.peek();
        System.out.println("top element is: " + top);
        System.out.println(queue);


    }




}
