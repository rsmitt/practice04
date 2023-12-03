package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anton");

        list.contains("Anton");

        HashSet<String> list2 = new HashSet<>();
        list.add("Anton");
        list.contains("Anton");

        City city1 = new City("City1", 50_000_000, 495);
        City city2 = new City("CITY1", 50_000_000, 495);

        System.out.println(city1.equals(city2));
        List<City> cities = new ArrayList<>();
        cities.add(city1);

        System.out.println(cities.contains(city2));
        System.out.println("city1: " + city1.hashCode());
        System.out.println("city2: " + city2.hashCode());

        HashSet<City> cities2 = new HashSet<>();
        cities2.add(city1);
        System.out.println(cities2.contains(city2));
    }
}
