package threads.entities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class ParkLot {

    private final Logger LOG = LogManager.getRootLogger();

    private int lotId;
    private int parkId;
    private static final int maxWaitMillisForUsingLot = 200;

    public ParkLot(int lotId, int parkId){
        super();
        this.lotId = lotId;
        this.parkId = parkId;
    }

    public int getLotId() {
        return lotId;
    }

    public int getParkId() {
        return parkId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public void using(){
        LOG.debug("LOT #" + lotId + " using by Car #" + Thread.currentThread().getId());
        try{
            TimeUnit.MILLISECONDS.sleep(new java.util.Random().nextInt(maxWaitMillisForUsingLot));
        } catch (InterruptedException e){
            LOG.error(e);
        }
    }

    @Override
    public String toString(){
        return "LOT #" + lotId + " PARK_ID #" + parkId;
    }
}
