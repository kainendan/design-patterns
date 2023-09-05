package strategy;

//** Returns a blocker-specific behavior for the lineman when on defense. */
public class BlockBehavior implements DefenseBehavior {
    
    @Override
    public String play() {
        String[] plays = {"kick", "punt", "pass", "catch"};
        int random = (int) (Math.random() * 4);
        return "blocks a " + plays[random];
    }
}
