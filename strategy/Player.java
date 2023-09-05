package strategy;

public abstract class Player {
    
    private String firstName;
    private String lastName;
    private boolean offense;

    protected OffenseBehavior offenseBehavior;
    protected DefenseBehavior defenseBehavior;

    public Player(String firstName, String lastName, boolean offense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }

    public abstract void setDefenseBehavior(DefenseBehavior defenseBehavior);

    public abstract void setOffenseBehavior(OffenseBehavior offenseBehavior);

    public String play() {

        setDefenseBehavior(defenseBehavior);
        setOffenseBehavior(offenseBehavior);

        if (offense) {
            if (offenseBehavior == null) {
                return "not playing";
            } else {
                return offenseBehavior.play();
            }
        } else {
            if (defenseBehavior == null) {
                return "not playing";
            } else {
                return defenseBehavior.play();
            }
        }
    }

    public void turnover() {
        if (offense) {
            offense = false;
        } else {
            offense = true;
        }
    }

    public String toString() {
        return firstName + " " + lastName;
    }
    
}
