package Recursion;

public class RecursionPractice3 {

    static int i;
    public static void main(String[] args) {
//        recur(5);
        String[] strArray = {"This","is","a","test."};
        recurString(strArray);
    }

    public static void recur(int x){
            if(x>0){
                System.out.print(x);
                x--;
                recur(x);
            }
    }

    public static void recurString(String[] x){
        if(i < x.length){
            System.out.print(x[i] + " ");
            i++;
            recurString(x);
        }
    }


}
