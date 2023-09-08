package observer;

/**
 * HoleScoreDisplay is an observer of Golfer
 * @return a string representation of the hole score
 */
public class HoleScoreDisplay implements Observer{
    
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * observer constructor
     * @param golfer
     */
    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the strokes and par for the hole
     * @param strokes the number of strokes for the hole
     * @param par the par for the hole
     */
    public void update(int strokes, int par){
        this.strokes = strokes;
        this.par = par;
        toString();
    }

    /**
     * @return a string representation of the hole strokes, par, and score
     */
    public String toString(){
        if(strokes - par == 0){
            return "\nCurrent Hole Stats: Par (" + par + ") Strokes (" + strokes + "), making par \n";
        }
        else if(strokes - par > 0){
            return "\nCurrent Hole Stats: Par (" + par + ") Strokes (" + strokes + "), " + (strokes - par) + " over par \n";
        }
        else{
            return "\nCurrent Hole Stats: Par (" + par + ") Strokes (" + strokes + "), " + (strokes - par) + " under par \n";
        }
    }

}
