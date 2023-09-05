package strategy;

//** Creates sack behavior for defense */
public class SackBehavior implements DefenseBehavior{
    
    @Override
    public String play() {
        return "sacks the quarterback";
    }
}
