package javaprogrammeweek9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        //Create a list of strings
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(8);
        mylist.add(10);
        mylist.add(26);
        mylist.add(5);
        System.out.println("Original List:- " + mylist);
        Collections.reverse(mylist);
        System.out.println("Modified List:- " + mylist);
    }
}
