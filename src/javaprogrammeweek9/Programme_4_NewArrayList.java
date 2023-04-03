package javaprogrammeweek9;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_NewArrayList {
    public static void main(String[] args) {
        List<String>  colour = new ArrayList<String>();
        colour.add("Red");
        colour.add("Yellow");
        colour.add("Pink");
        colour.add("Black");
        colour.add("Magenta");
        colour.add("Blue");
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object a: colour) {
            System.out.println("Contents of ArrayList using for-each loop: " + a);
        }
    }
}
