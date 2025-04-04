package org.example;

import java.util.List;

public record Zoo(List<Animal> animals) {
    public int totalFeedRequirement() {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.species().feedRequirement();
        }
        return sum;
    }
}
