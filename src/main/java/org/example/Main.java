package org.example;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Bonny", "Dog", 14);
        Animal cat = new Animal("Garfield", "Cat", 8);
        Animal bird1 = new Animal(UUID.fromString("9ee8be82-d85f-4c6b-a3eb-f3e0e7f3ac63"),"Birdie", "Bird", 2);
        Animal bird2 = new Animal(UUID.fromString("9ee8be82-d85f-4c6b-a3eb-f3e0e7f3ac63"),"Birdie", "Bird", 2);

        System.out.println(dog);

        System.out.println(dog.ID());
        System.out.println(dog.name());
        System.out.println(dog.species());
        System.out.println(dog.age());
        System.out.println(dog.hashCode());

        System.out.println(cat);

        System.out.println(cat.ID());
        System.out.println(cat.name());
        System.out.println(cat.species());
        System.out.println(cat.age());
        System.out.println(cat.hashCode());

        System.out.println(dog.equals(cat));
        System.out.println(cat.equals(dog));

        System.out.println(bird1.equals(bird2));

    }
}