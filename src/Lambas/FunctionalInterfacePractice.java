package Lambas;

import java.util.function.*;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {

        //The following are all implementations of different Functional Interfaces
        //Predicate - takes one argument and returns a Boolean
        Predicate<String> stringLen = (s) -> s.length()<10;
        System.out.println(stringLen.test("Apples") + " - Applies is less than 10");

        //Consumer - accepts single argument with no return value
        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("ABCDefghijklmnopQRSTuvWxyZ");

        //Function - Accepts one argument and produces a result
        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println("length of 26: " + converter.apply(26).length());

        //Supplier - represents a supplier of results
        Supplier<String> s = () -> "Java is fun";
        System.out.println(s.get());

        //BinaryOperator - takes two arguments and returns one
        BinaryOperator<Integer> add = (a,b) -> a+b;
        System.out.println("add 10 + 25 +: " + add.apply(10,25));

        // UnaryOperator - single argument and returns a single value
        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("This is my message in uppercase"));
    }
}
