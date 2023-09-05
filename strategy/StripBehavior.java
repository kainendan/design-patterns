package strategy;

//** Creates strip behavior for defense */
public class StripBehavior implements DefenseBehavior{
    
    @Override
    public String play() {
        return "strips a ball from the runner's hands";
    }
}
