package strategy;

public class QuarterBack extends Player {
    
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    @Override
    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        this.defenseBehavior = null;
    }

    @Override
    public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            this.offenseBehavior = new RunBehavior();
        } else {
            this.offenseBehavior = new PassBehavior();
        }
    }

    
}