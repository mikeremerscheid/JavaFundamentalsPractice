package Recursion;

public class RecursionPractice2 {

    public static void main(String[] args) {

        System.out.println(looper(10));

    }


    public static int looper(int x){
        if (x > 0){
            return x+looper(x-1);
        }else{
            return 0;
        }
    }




}
