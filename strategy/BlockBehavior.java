package strategy;

public class BlockBehavior implements DefenseBehavior {
    
    @Override
    public String play() {
        String[] plays = {"kick", "punt", "pass", "catch"};
        int random = (int) (Math.random() * 4);
        return "blocks a " + plays[random];
    }
}
