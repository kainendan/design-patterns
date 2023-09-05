package strategy;

//** Returns behavior when offense is true for Lineman */
public class OBlockBehavior implements OffenseBehavior{
    
    @Override
   public String play() {
       return "blocks the defenders";
   }

}
