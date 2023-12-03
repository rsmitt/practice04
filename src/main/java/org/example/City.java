package org.example;

import java.util.Objects;

public class City {

    private String name;
    private int population;
    private int phoneCode;

    public City(String name, int population, int phoneCode) {
        this.name = name;
        this.population = population;
        this.phoneCode = phoneCode;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), population, phoneCode);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }

        City other = (City) obj;
        return this.name.equalsIgnoreCase(other.name)
                && this.population == other.population && this.phoneCode == other.phoneCode;
    }
}
