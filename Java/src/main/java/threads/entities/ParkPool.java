package threads.entities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ParkPool {
    private final Logger LOG = LogManager.getRootLogger();
    private ArrayList<CarPark> pool = new ArrayList<>();

    public ParkPool(){
    }

    public void addToPool(CarPark park){
        pool.add(park);
    }

    public ParkLot getLot(long maxWaitMillis) {
        LOG.debug("Car #" + Thread.currentThread().getId() + " tried to getLot");
        ParkLot toReturn = null;
        for (CarPark park : pool) {
            ParkLot lot = park.takeLot(maxWaitMillis);
            if (lot != null){
                toReturn = lot;
                break;
            }
            else {
                LOG.info("Car #" + Thread.currentThread().getId() + " -> timeout. Going to another parking.");
            }
        }
        return toReturn;
    }

    public void returnLot(ParkLot lot){
        for (CarPark park : pool) {
            if (park.getParkId() == lot.getParkId()) {
                park.returnLot(lot);
            }
        }
    }
}
