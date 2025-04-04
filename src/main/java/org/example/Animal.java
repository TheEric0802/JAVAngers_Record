package org.example;

import java.util.UUID;

public record Animal(UUID ID, String name, String species, int age) {
    public Animal(String name, String species, int age) {
        this(UUID.randomUUID(), name, species, age);
    }
}
