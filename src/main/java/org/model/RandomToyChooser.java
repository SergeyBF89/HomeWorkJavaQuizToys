package org.model;

import java.util.List;

public class RandomToyChooser {
    public Toy chooserWeight(List<Toy> toys) {
        Double completeWeight = 0.0;
        for (Toy toy : toys)
            completeWeight += toy.getWeight();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= r)
                return toy;
        }
        throw new RuntimeException();
    }
}
