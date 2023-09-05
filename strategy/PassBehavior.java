package strategy;

//** Selects a random pass play */
public class PassBehavior implements OffenseBehavior{
    
    @Override
    public String play() {
        String[] plays = {"slant route", "out route", "seam route", "screen pass", "hail mary"};
        int random = (int) (Math.random() * 5);
        return "throws a " + plays[random];
    }

}
