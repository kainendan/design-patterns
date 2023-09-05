package strategy;

public class RunBehavior implements OffenseBehavior{
    
    @Override
    public String play() {
        String[] runs = {"drive (up the gut)", "draw", "pitch", "reverse"};
        int random = (int)(Math.random() * 4);
        return "runs a " + runs[random];
    }
}

