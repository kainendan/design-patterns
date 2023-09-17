package decorator;

import java.util.ArrayList;

/*
 * Abstract class for the vehicle decorator
 */
public abstract class VehicleDecorator extends Vehicle{
    
    /*
     * Constructor for the vehicle decorator
     * @param lines - the lines of the vehicle
     */
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    /*
     * Integrates the decoration into the vehicle character by character
     * @param decor - the decoration to integrate
     */
    protected void integrateDecor(ArrayList<String> decor){
        for (int i = 0; i < decor.size(); i++) {
            String line = decor.get(i);
            String vehicleLine = lines.get(i);
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) != ' ') {
                    vehicleLine = vehicleLine.substring(0, j) + line.charAt(j) + vehicleLine.substring(j + 1);
                }
            }
            lines.set(i, vehicleLine);
        }
    }
        

}