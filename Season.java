import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Season {

    private List<Driver> driverStandings;
    private List<Team> constructorStandings;

    public Season() {

        driverStandings = new ArrayList<>();
        constructorStandings = new ArrayList<>();
    }

    public void addDriver(Driver driver) {

        driverStandings.add(driver);
    }

    public void addTeam(Team team) {

        constructorStandings.add(team);
    }

    public void updateDriverStandings() {
        // Sort driver standings based on total points in descending order
        Collections.sort(driverStandings, (driver1, driver2) -> Integer.compare(driver2.getPoints(), driver1.getPoints()));
    }

    public void updateConstructorStandings() {
        // Create a map to track team points
        Map<Team, Integer> teamPoints = new HashMap<>();

        // Calculate team points based on their drivers' points
        for (Team team : constructorStandings) {
            team.calculateTotalPoints();
        }

        // Sort constructor standings based on total team points in descending order
        constructorStandings.sort((team1, team2) -> Integer.compare(teamPoints.get(team2), teamPoints.get(team1)));
    }

    public List<Driver> getDriverStandings() {

        return driverStandings;
    }

    public List<Team> getConstructorStandings() {

        return constructorStandings;
    }

    public void displayDriverStandings() {

        System.out.println("Driver Championship Standings:");

        for (int i = 0; i < driverStandings.size(); i++) {

            Driver driver = driverStandings.get(i);
            System.out.println((i + 1) + ". " + driver.getName() + " - Points: " + driver.getPoints());
        }
    }

    public void displayConstructorStandings() {

        System.out.println("Constructor Standings:");

        for (int i = 0; i < constructorStandings.size(); i++) {

            Team team = constructorStandings.get(i);
            System.out.println((i + 1) + ". " + team.getName() + " - Points: " + team.getTotalPoints());
        }
    }

}
