public class UI {

    public static void main(String[] args) {
        // Create a season
        Season twenty3 = new Season();

        // Create teams and drivers
        Team Ferrari = new Team("Ferrari");
        Driver LEC = new Driver("LEC", Ferrari);
        Driver SAI = new Driver("SAI", Ferrari);

        Ferrari.addDriver(LEC);
        Ferrari.addDriver(SAI);

        // Create a race
        Race Bahrain = new Race("Bahrain");

        // Simulate race results
        LEC.achievePodium();
        LEC.win();
        SAI.achievePodium();

        // Set the driver with the fastest lap
        Bahrain.setFastestLapDriver(LEC);

        // Add drivers to the race
        Bahrain.addDriver(LEC);
        Bahrain.addDriver(SAI);

        // Award points in the race
        Bahrain.awardPoints();

        // Add drivers, teams, and races to the season
        twenty3.addDriver(LEC);
        twenty3.addDriver(SAI);
        twenty3.addTeam(Ferrari);
        twenty3.addRace(Bahrain);

        // Calculate points and update standings for the entire season
        twenty3.calculatePointsAndStandings();

        // Display standings
        twenty3.displayDriverStandings();
        twenty3.displayConstructorStandings();
    }
}
