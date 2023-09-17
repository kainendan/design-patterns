package decorator;

import java.util.ArrayList;

/*
 * Class for the smile
 */
public class Smile extends VehicleDecorator {

    /*
     * Constructor for the smile
     * @param vehicle - the vehicle to add the smile to
     */
    public Smile(Vehicle vehicle){
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
    }
    
}