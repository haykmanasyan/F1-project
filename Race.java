import java.util.ArrayList;
import java.util.List;

public class Race {
    
    private List<Driver> finishingOrder;
    private Driver fastestLapDriver;

    public Race() {

        finishingOrder = new ArrayList<>();
    }

    public void addDriver(Driver driver) {

        finishingOrder.add(driver);
    }

    public List<Driver> getFinishingOrder() {

        return finishingOrder;
    }

    public Driver getFastestLapDriver() {

        return fastestLapDriver;
    }

    public void setFastestLapDriver(Driver driver) {
        
        fastestLapDriver = driver;
    }
}
