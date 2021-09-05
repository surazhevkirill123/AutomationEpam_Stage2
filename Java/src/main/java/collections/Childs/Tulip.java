package collections.Childs;

import collections.ColorEnum.ColorEnum;
import collections.Flower.Flower;

public class Tulip extends Flower {
    private final static String name = "Тюльпан";

    public Tulip(double price, ColorEnum color, int freshness, int stemLength) {
        super(price, name, color, freshness, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
