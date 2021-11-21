package threads.entities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Car extends Thread {

    private final Logger LOG = LogManager.getRootLogger();
    private ParkPool pool;
    private static final int MAX_WAIT_MILLIS_FOR_GETTING_LOT = 500;

    public Car(ParkPool pool) {
        this.pool = pool;
        LOG.info("Car #" + this.getId() + " is created");
    }

    public void run() {
        this.setName("Car-" + this.getId());
        ParkLot lot = null;

        while (lot == null) {
            lot = pool.getLot(MAX_WAIT_MILLIS_FOR_GETTING_LOT);
        }
        LOG.info("Car №" + this.getId() + " took park lot №" + lot.getLotId() + ". Parking №" + lot.getParkId());

        lot.using();
        LOG.info("Car №" + this.getId() + " : " + lot.getLotId() + " lot released. Parking №" + lot.getParkId());

        pool.returnLot(lot);
        LOG.debug("Car #" + this.getId() + " is terminated");
    }
}
