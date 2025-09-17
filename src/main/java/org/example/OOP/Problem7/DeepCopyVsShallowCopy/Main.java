package org.example.OOP.Problem7.DeepCopyVsShallowCopy;

public class Main {
    public static void main(String[] args) {
        City city = new City("Dhaka");
        Person p1 = new Person("nayeem",city);

        Person clonedPerson = p1.clone();



        System.out.println(p1.getCity().getCityName());
        System.out.println(p1.getName());
        System.out.println(clonedPerson.getCity().getCityName());
        System.out.println(clonedPerson.getName());


        city.setCityName("ctg");
        p1.setName("Rayhan");

        System.out.println(p1.getCity().getCityName());
        System.out.println(clonedPerson.getCity().getCityName());
        System.out.println(p1.getName());
        System.out.println(clonedPerson.getName());

        System.out.println(p1==clonedPerson);
        System.out.println(p1.equals(clonedPerson));
        System.out.println(p1.getCity() == clonedPerson.getCity());
        System.out.println(p1.getCity().getCityName().equals(clonedPerson.getCity().getCityName()));
    }
}
