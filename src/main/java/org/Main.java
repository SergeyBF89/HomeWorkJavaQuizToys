package org;

import org.model.Toy;
import org.model.ToysMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Машинка Гоночная", 150.0);
        Toy toy2 = new Toy(2, "Кукла Барби", 80.0);
        Toy toy3 = new Toy(3, "Плюшевый мишка", 90.0);
        Toy toy4 = new Toy(4, "Конструктор Lego", 150.0);
        Toy toy5 = new Toy(5, "Набор солдатиков", 120.0);

        List<Toy> toys = new ArrayList<>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);

        ToysMachine toysMachine = new ToysMachine(toys);
        toysMachine.saveToyQuiz();
        toysMachine.saveToyQuiz();
        toysMachine.saveToyQuiz();
        toysMachine.saveToyQuiz();
        toysMachine.saveToyQuiz();
    }
}
