package org.model;

public class Toy {
    private int id;
    private String name;
    private Double weight;

    public Toy(int id, String name, Double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toys: id = " + id + ": name: " + name + ": weight: " + weight;
    }
}
