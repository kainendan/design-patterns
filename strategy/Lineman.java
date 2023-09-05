package strategy;

//** Describes Lineman-specific behavior */
public class Lineman extends Player {
    
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    @Override
    public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
        //Lineman can only block on offense
        this.offenseBehavior = new OBlockBehavior();
    }

    @Override
    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        //Lineman can block, sack, or strip on defense
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
