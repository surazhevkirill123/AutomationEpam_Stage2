package collections.Bouquet;

import collections.Flower.Flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private double price;
    private List<Flower> flowers = new ArrayList<Flower>();

    public double getPrice() {
        return price;
    }

    public Bouquet addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
        return this;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return String.format("Bouquet{price=%s, flowers=%s}", price, flowers);
    }

    public void findFlowerByStemLengthRange(int parameter1, int parameter2) {
        flowers.stream().filter(x -> x.getStemLength() >= parameter1 && x.getStemLength() <= parameter2).forEach(System.out::println);
    }
}
