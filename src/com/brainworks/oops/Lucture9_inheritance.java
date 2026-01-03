package com.brainworks.oops;

public class Lucture9_inheritance {
    public static void main(String[] args) {
//        Animal monkey1 = new Animal(4, "sheru");               //compiler creates default constructor
//        System.out.println(monkey1.animalName);
//        System.out.println(monkey1.noOfLegs);
//        Animal monkey2 = new Animal();
//        System.out.println(monkey2.animalName);
//        System.out.println(monkey2.noOfLegs);
//        Animal dog = new Animal(4, "doggy");
//        Animal human = new Animal(2, "human123");
//        monkey1.Animal(4, "Sheru");

//        Animal cat = new Animal(4, "meow");
//        System.out.println(cat.noOfLegs);
//        System.out.println(cat.animalName);
//        Animal dog = new Animal(3, "Sherlock");
//        System.out.println(dog.noOfLegs);
//        System.out.println(dog.animalName);

//        Animal lion = new Animal();
//        Animal tiger = new Animal();
        Animal sher = Animal.Singleton();
        Animal bubberSher = Animal.Singleton();

//        System.out.println(lion==tiger);
        System.out.println(sher==bubberSher);
    }
}
