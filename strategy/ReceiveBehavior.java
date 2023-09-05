package strategy;

//* Randomly selects a reciever-specific behavior for the reciever */

public class ReceiveBehavior implements OffenseBehavior {
    
    @Override
    public String play() {
        String[] plays = {"slant route", "out route", "in route", "screen pass", "hail mary"};
        int random = (int) (Math.random() * 5);
        return "runs a " + plays[random];
    }
}
