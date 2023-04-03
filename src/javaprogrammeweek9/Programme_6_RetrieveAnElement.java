package javaprogrammeweek9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElement {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(4);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println("List: " + arr);

        int element = arr.get(3);

        System.out.println("the element at index 3 is " + element);
    }
}
