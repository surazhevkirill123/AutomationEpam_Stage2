package threads.creator;

import threads.entity.CarPark;
import threads.entity.ParkLot;

public class Creator {

    public static CarPark createPark(int parkId, int countOfLots) {
        CarPark park = new CarPark(parkId, countOfLots);

        for (int i = 1; i < countOfLots + 1; i++) {
            park.addToParkLots(new ParkLot(i, park.getParkId()));
        }
        return park;
    }
}
