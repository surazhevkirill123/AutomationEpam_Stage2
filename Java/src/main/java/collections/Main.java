package collections;


import collections.Bouquet.Bouquet;
import collections.Childs.Rose;
import collections.Childs.Tulip;
import collections.Childs.Violet;
import collections.ColorEnum.ColorEnum;
import collections.Flower.Flower;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rose ros1 = new Rose(36.5, ColorEnum.Red, 50, 20);
        Tulip tulip1 = new Tulip(20, ColorEnum.Green, 40, 15);
        Violet vio1 = new Violet(55.56, ColorEnum.Yellow, 60, 55);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(ros1).addFlower(tulip1).addFlower(vio1);
        System.out.println(bouquet.toString());                         //получившийся букет
        System.out.println(bouquet.getPrice());                         //цена всего букета
        List<Flower> flowers = bouquet.getFlowers();
        Collections.sort(flowers, Flower.COMPARE_BY_FRESHNESS);
        bouquet.setFlowers(flowers);
        System.out.println("Отсортированный: " + bouquet.toString());   //отсортированный по свежести букет
        bouquet.findFlowerByStemLengthRange(15,20);                   //нашли цветок по длине стебля(в диапазоне)
    }
}
