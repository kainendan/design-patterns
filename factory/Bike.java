package factory;

public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public String assembleBike(){
        return "Creating " + name + "\n" + createFrame() + "\n" + addWheels() + "\n" + addPedals() + "\n" + "Price: " + getPrice();
    }

    private String createFrame(){
        return "Adding "+name+" frame to the bike";
    }

    private String addWheels(){
        if (hasTrainingWheels){
            numWheels += 2;
            return "Adding training wheels to the bike. Bike now has "+numWheels+" wheels.";
        } else {
            return "Adding "+numWheels+" wheels to the bike";
        }
    }

    private String addPedals(){
        if (hasPedals){
            return "Adding pedals to the bike";
        } else {
            return "Not adding pedals to the bike";
        }
    }

    public double getPrice(){
        return price;
    }
}
