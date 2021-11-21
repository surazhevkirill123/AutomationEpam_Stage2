package threads.main;

import threads.creator.Creator;
import threads.entities.Car;
import threads.entities.ParkPool;

public class Main {
    public static void main(String[] args) {
        ParkPool pool = new ParkPool();
        pool.addToPool(Creator.createPark(1,5));
        pool.addToPool(Creator.createPark(2,6));
        pool.addToPool(Creator.createPark(3,7));

        for (int i = 0; i < 80; i++) {
            new Car(pool).start();
        }

    }

}
