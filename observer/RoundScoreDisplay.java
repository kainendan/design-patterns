package observer;

/**
 * HoleScoreDisplay is an observer of Golfer
 * @return a string representation of the round score
 */
public class RoundScoreDisplay implements Observer{
    
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * observer constructor
     * @param golfer the subject to observe
     */
    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the strokes and par for the hole and adds them to the total
     * @param strokes the number of strokes for the hole
     * @param par the par for the hole
     */
    public void update(int strokes, int par){
        strokesTotal += strokes;
        parTotal += par;
        toString();
    }

    /**
     * @return a string representation of the round strokes, par, and score
     */
    public String toString(){
        if(strokesTotal - parTotal == 0){
            return "Overall Stats: Par (" + parTotal + ") Strokes (" + strokesTotal + "), making par\n";
        }
        else if(strokesTotal - parTotal > 0){
            return "Overall Stats: Par (" + parTotal + ") Strokes (" + strokesTotal + "), " + (strokesTotal - parTotal) + " over par\n";
        }
        else{
            return "Overall Stats: Par (" + parTotal + ") Strokes (" + strokesTotal + "), " + (strokesTotal - parTotal) + " under par\n";
        }
    }
}
