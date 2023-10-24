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

    public void awardPoints() {
        
        int[] modernF1Points = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};
    
        for (int i = 0; i < finishingOrder.size() && i < modernF1Points.length; i++) {
            Driver driver = finishingOrder.get(i);
            driver.earnPoints(modernF1Points[i]);
        
            // Award an additional point for the driver with the fastest lap
            if (fastestLapDriver != null && driver == fastestLapDriver) {
                driver.earnPoints(1);
            }
        }
    }

    public String getName() {
        
        return name;
    }
}
