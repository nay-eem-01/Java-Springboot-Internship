package org.example.OOP.Problem7.DeepCopyVsShallowCopy;

import java.util.Objects;

public class Person implements Cloneable{
    private String name;
    private City city;

    public Person(String name, City city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public Person clone() {
        try {
            Person clonedPerson = (Person) super.clone();
            clonedPerson.city = this.city.clone();
            return clonedPerson;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
