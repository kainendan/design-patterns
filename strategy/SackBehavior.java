package strategy;

public class SackBehavior implements DefenseBehavior{
    
    @Override
    public String play() {
        return "sacks the quarterback";
    }
}
