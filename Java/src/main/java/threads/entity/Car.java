package threads.entity;

import threads.pool.ParkPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Car extends Thread {

    private final Logger LOG = LogManager.getRootLogger();
    private boolean standing;
    private ParkPool pool;

    public Car(ParkPool pool){
        this.pool = pool;
        LOG.info("Car #" + this.getId() + " is created");
    }

    public void run(){
        this.setName("Car-" + this.getId());
        ParkLot lot = null;

        while (lot == null){
            //LOG.debug("Try of getting lot (while). Car #" + this.getId());
            lot = pool.getLot(500);
        }
        LOG.info("Car №" + this.getId() + " took park lot №" + lot.getLotId() + ". Parking №" + lot.getParkId());
        standing = true;

        lot.using();

        standing = false;
        LOG.info("Car №" + this.getId() + " : " + lot.getLotId() + " lot released. Parking №" + lot.getParkId());
        while (true){
            if (pool.returnLot(lot)){
                break;
            }
        }
        LOG.debug("Car #" + this.getId() + " is terminated");
    }
}
