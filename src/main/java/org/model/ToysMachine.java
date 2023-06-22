package org.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToysMachine {
    private List<Toy> toys;

    public ToysMachine(List<Toy> toys) {
        this.toys = toys;
    }

    public Toy getToyPrice() {
        RandomToyChooser random = new RandomToyChooser();
        Toy toy = random.chooserWeight(toys);
        return toy;
    }

    public void saveToyQuiz() {
        Toy toy = getToyPrice();
        String text = toy.toString();
        try (FileWriter writer = new FileWriter("C:/lessons/Java/ToysQuiz/src/main/java/org/Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
