package Generics;

public class GenericPractice01 {
    public static void main(String[] args) {
        Character[] charArray = {'M','i','c','h','a','e','l'};
        Integer[] intArray = {3,2,1,5,6,7};
        printOut(charArray);
        printOut(intArray);
    }

    public static <T> void printOut(T[] x){
        for (T each: x){
            System.out.print(each);
        }
    }
//
//    public static <T extends Comparable<T>> T compare(T[] x){
//
//    }


}
