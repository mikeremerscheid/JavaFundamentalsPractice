package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListChallenge {

    public static void main(String[] args) {

        //Create an ArrayList of grocery items
        ArrayList<String> list1 = new ArrayList<>(){{
            add("Bacon");
            add("Lettuce");
            add("Peas");
        }};

        //Create a second list of more items
        ArrayList<String> list2 = new ArrayList<>(){{
            add("Cereal");
            add("Bread");
            add("Avocado");
        }};

        ArrayList<String> list3 = new ArrayList(Arrays.asList("Sugar", "Cheese", "Baking Soda"));

        //Add the extra items to your original list
        list1.addAll(list2);
        list1.addAll(list3);

        //Search and remove an item
        if (list1.contains("Cereal")){
            list1.remove("Cereal");
        }
        System.out.println(list1);




    }


}
