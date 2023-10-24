import java.util.ArrayList;
import java.util.List;

public class Team {
    
    private String name;
    private List<Driver> drivers;
    private int totalPoints;

    public Team(String name) {

        this.name = name;
        this.drivers = new ArrayList<>();
        this.totalPoints = 0;
    }

    public String getName() {

        return name;
    }

    public void addDriver(Driver driver) {

        drivers.add(driver);
    }

    public List<Driver> getDrivers() {

        return drivers;
    }

    public void calculateTotalPoints() {

        totalPoints = 0;

        for (Driver driver : drivers) {
            
            totalPoints += driver.getPoints();
        }
    }

    public int getTotalPoints() {

        return totalPoints;
    }
}
