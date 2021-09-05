package collections.Flower;

import collections.ColorEnum.ColorEnum;

import java.util.Comparator;

public abstract class Flower {
    private double price;
    private String name;
    private ColorEnum color;
    private int freshness;
    private int stemLength;


    protected Flower(double price, String name, ColorEnum color, int freshness, int stemLength) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be less than zero.");
        }
        this.price = price;
        if (name == null) {
            throw new NullPointerException("Argument name cannot be null.");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name of flower cannot be empty.");
        }
        this.name = name;
        if (color == null) {
            throw new NullPointerException("Argument color cannot be null.");
        }
        this.color = color;
        if (freshness < 0 || freshness > 100) {
            throw new IllegalArgumentException("Freshness cannot be less than zero or more than 100.");
        }
        this.freshness = freshness;
        if (stemLength < 0) {
            throw new IllegalArgumentException("Price cannot be less than zero.");
        }
        this.stemLength = stemLength;
    }

    public double getPrice() {
        return price;
    }

    public int getFreshness() {
        return freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public static final Comparator<Flower> COMPARE_BY_FRESHNESS = Comparator.comparingInt(Flower::getFreshness);

    @Override
    public String toString() {
        return String.format("Flower{price=%s, name='%s', color=%s, freshness=%d, stemLength=%d}", price, name, color, freshness, stemLength);
    }
}








