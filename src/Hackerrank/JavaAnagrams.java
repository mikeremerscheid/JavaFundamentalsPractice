package Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map<Character, Integer> aCount = new HashMap<Character, Integer>();
        Map<Character, Integer> bCount = new HashMap<Character, Integer>();

        for (int i = 0; i < a.length()-1; i++){
            if (aCount.containsKey(a.charAt(i))){
                aCount.put(a.charAt(i),1);
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}