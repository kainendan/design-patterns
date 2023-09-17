package decorator;

import java.util.ArrayList;

/*
 * Abstract class for the vehicle
 */
public abstract class Vehicle {
    
    protected ArrayList<String> lines = new ArrayList<String>();

    /*
     * Constructor for the vehicle
     * @param lines - the lines of the vehicle
     */
    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }

    /*
     * Returns the vehicle as a string
     * @return the vehicle as a string
     */
    public String toString(){
        String output = "";
        for (String line : lines) {
            output += line + "\n";
        }
        return output;
    }
}
