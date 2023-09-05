package strategy;

//** Creates a receiver player */
public class Receiver extends Player {
    
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    @Override
    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        //Defense has no receiver
        this.defenseBehavior = null;
    }

    @Override
    public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
        //Receiver can only receive on offense
        this.offenseBehavior = new ReceiveBehavior();
    }
    
}
