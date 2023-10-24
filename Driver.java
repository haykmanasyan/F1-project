public class Driver{

    private String acronym;
    private int wins;
    private int podiums;
    private int points;

    public void win(){
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

    public void setName(String name) {
        this.acronym = name;
    }

    
}