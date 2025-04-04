package org.example;

import java.util.UUID;

public record Animal(UUID ID, String name, String species, int age, Owner owner) {
    public Animal(String name, String species, int age, Owner owner) {
        this(UUID.randomUUID(), name, species, age, owner);
    }
}
