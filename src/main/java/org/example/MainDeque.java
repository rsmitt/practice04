package org.example;

import java.util.*;

public class MainDeque {

    public static void main(String[] args) {
        Queue<String> fifo = new LinkedList<>();
        fifo.add("Moscow");
        fifo.add("Anapa");
        fifo.add("Omsk");

        System.out.println(fifo.element() + " size: " + fifo.size());
        System.out.println(fifo.remove() + " size: " + fifo.size());

        Queue<String> fifo2 = new ArrayDeque<>();
        fifo2.add("Moscow");
        fifo2.add("Anapa");
        fifo2.add("Omsk");

        System.out.println(fifo2.element() + " size: " + fifo2.size());
        System.out.println(fifo2.remove() + " size: " + fifo2.size());

        Deque<String> fifo3 = new ArrayDeque<>();
        fifo3.push("Moscow");
        fifo3.push("Anapa");
        fifo3.push("Omsk");

        PriorityQueue<String> cities = new PriorityQueue<>(3, new StringComparator());
        cities.add("Moscow");
    }
}
