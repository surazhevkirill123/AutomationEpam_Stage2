package threads.main;

import threads.creator.Creator;
import threads.entity.Car;
import threads.pool.ParkPool;

public class Main {
    public static void main(String[] args) {
        ParkPool pool = new ParkPool();
        pool.addToPool(Creator.createPark(0,5));
        pool.addToPool(Creator.createPark(1,6));
        pool.addToPool(Creator.createPark(2,7));

        for (int i = 0; i < 80; i++) {
            new Car(pool).start();
        }

    }

}
