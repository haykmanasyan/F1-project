import java.util.ArrayList;
import java.util.List;

public class Race {
    
    private List<Driver> finishingOrder;
    private Driver fastestLapDriver;
    private String name;

    public Race(String title) {
        
        finishingOrder = new ArrayList<>();
        this.name = title;
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

    public String getName() {
        
        return name;
    }
}
