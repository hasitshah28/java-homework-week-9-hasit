package javaprogrammeweek9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayListEmpty {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Orange");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Red");

        System.out.println("Original array list: " + list);
        System.out.println("Checking the above array list is empty or not! "+list.isEmpty());
        list.removeAll(list);

        System.out.println("Array list after remove all elements "+list);
        System.out.println("Checking the above array list is empty or not! "+list.isEmpty());
    }
    }

