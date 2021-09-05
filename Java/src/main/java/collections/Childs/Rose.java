package collections.Childs;

import collections.ColorEnum.ColorEnum;
import collections.Flower.Flower;

public class Rose extends Flower {
    private final static String name = "Роза";

    public Rose(double price, ColorEnum color, int freshness, int stemLength) {
        super(price, name, color, freshness, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
