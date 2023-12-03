package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
/*        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(null);
        list.add(-1);

        Comparator<Integer> comparator = new DigitComparator();
        //list.sort(Integer::compareTo);

        list.sort(comparator);
        System.out.println(list);*/


        List<String> list = new ArrayList<>();
        list.add("Anton");
        list.add("Petr");
        list.add("Anna");

        Comparator<String> comparator = new StringComparator();
        //list.sort(String::compareTo);
        list.sort(comparator);
        System.out.println(list);
    }
}
