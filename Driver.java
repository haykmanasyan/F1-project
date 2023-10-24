public class Driver{

    private String acronym;
    private int wins;
    private int podiums;
    private int points;

    private Team team;

    public Driver(String acronym, Team team) {

        this.acronym = acronym;
        this.team = team;
    }

    public void win() {

        wins++;
    }

    public void achievePodium() {

        podiums++;
    }

    public void earnPoints(int pointsEarned) {

        points += pointsEarned;
    }

    public String getName() {

        return acronym;
    }

    public int getWins() {

        return wins;
    }

    public int getPodiums() {

        return podiums;
    }

    public int getPoints() {

        return points;
    }

    public Team getTeam() {
        
        return team;
    }
 
}