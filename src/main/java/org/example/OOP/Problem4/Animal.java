package org.example.OOP.Problem4;



public class Animal {
    public void sound(){
        System.out.println("Animal make sounds");
    }
    public void noOfLegs(int leg, int wing){
        System.out.println("Animal has " + leg + "legs & "+ wing+ "wings");
    }


}

class Dog extends Animal{


    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void noOfLegs(int leg) {
        System.out.println("Dog has " + leg + " legs");
    }
}

class Chicken extends Animal{


    @Override
    public void sound() {
        System.out.println("Chicken does kukurukku");
    }

    public void noOfLegs(int leg,int wing) {
        System.out.println("Chicken has " + leg + "legs & "+ wing+ "wings");
    }

}

class helper{
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Dog dog = new Dog();

        chicken.sound();
        dog.sound();

        chicken.noOfLegs(2,2);
        dog.noOfLegs(4);
    }
}
