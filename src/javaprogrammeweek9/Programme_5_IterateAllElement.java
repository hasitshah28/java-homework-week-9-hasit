package javaprogrammeweek9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_IterateAllElement {
    // Main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing ArrayList
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Iterating ArrayList using Iterator
        Iterator it = numbers.iterator();

        // Holds true till there is single element
        // remaining in the list
        while (it.hasNext())

            // Print the elements of ArrayList
            System.out.print(it.next() + " ");
    }
}
