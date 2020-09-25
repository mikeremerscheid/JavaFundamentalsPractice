package DataStructures;

import java.util.Stack;

public class StackPractice {

    //Stacks are a Last In First Out (LIFO) data structure

    public static void main(String[] args) {

        Stack stack = new Stack();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        while(!stack.empty()){
            System.out.print(stack.pop());
            System.out.print(",");
        }
        System.out.println("Lift Off!");

    }


}
