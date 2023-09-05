package strategy;

public class Receiver extends Player {
    
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    @Override
    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        this.defenseBehavior = null;
    }

    @Override
    public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
        this.offenseBehavior = new ReceiveBehavior();
    }
    
}
