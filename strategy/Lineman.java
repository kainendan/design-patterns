package strategy;

public class Lineman extends Player {
    
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    @Override
    public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
        this.offenseBehavior = new OBlockBehavior();
    }

    @Override
    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            this.defenseBehavior = new BlockBehavior();
        } else if (random == 1) {
            this.defenseBehavior = new SackBehavior();
        } else {
            this.defenseBehavior = new StripBehavior();
        }
    }
}
