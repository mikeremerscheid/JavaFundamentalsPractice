package Lambas;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Lambdas_01_02 {

    public static void main(String[] args) {

        //Anonymous Inner Class: Runnable
        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("run 1");
            }
        };

        //Lambda version of Runnable (no arguments)
        Runnable r2 = () -> System.out.println("run 2");

        r1.run();
        r2.run();

        //using an existing functional interface BiFunction
        BiFunction<String, String, String> concat = (a,b) -> a+b;
        String sentence = concat.apply("Today is ", "a great day");
        System.out.println(sentence);

        BiFunction<Character, Integer, String> concat2 = (a,b) -> String.valueOf(a+b);
        System.out.println(concat2.apply('B',5));

        //example of a Consumer functional interface
        Consumer<String> hello = name -> System.out.println("Hello, " + name);
        for (String name: Arrays.asList("Duke", "Mickey", "Minnie")){
            hello.accept(name);
        }

//        @FunctionalInterface
//        interface GreetingFunction {
//            void sayMessage(String message);
//        }
//
//        GreetingFunction greeting = message ->
//                System.out.println("Java Programming " + message);
//        greeting.sayMessage("Rocks with lambda expressions!");









    }
}
