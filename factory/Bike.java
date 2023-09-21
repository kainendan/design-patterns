package factory;

/*
 * Abstract class for a bike
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /*
     * Assembles the bike
     * @return String describing the bike
     */
    public String assembleBike(){
        return "Creating " + name + "\n" + createFrame() + "\n" + addWheels() + "\n" + addPedals() + "\n" + "Price: " + getPrice();
    }

    /*
     * Creates the frame of the bike
     * @return String describing the frame
     */
    private String createFrame(){
        return "Adding "+name+" frame to the bike";
    }

    /*
     * Adds wheels to the bike
     * @return String describing the wheels
     */
    private String addWheels(){
        if (hasTrainingWheels){
            numWheels += 2;
            return "Adding training wheels to the bike. Bike now has "+numWheels+" wheels.";
        } else {
            return "Adding "+numWheels+" wheels to the bike";
        }
    }

    /*
     * Adds pedals to the bike
     * @return String describing the pedals
     */
    private String addPedals(){
        if (hasPedals){
            return "Adding pedals to the bike";
        } else {
            return "Not adding pedals to the bike";
        }
    }

    /*
     * Gets the price of the bike
     * @return double price of the bike
     */
    public double getPrice(){
        return price;
    }
}
