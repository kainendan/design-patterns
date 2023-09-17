package decorator;

import java.io.File;
import java.util.ArrayList;

/*
 * Class for the rims
 */
public class Rims extends VehicleDecorator{
    
    /*
     * Constructor for the rims
     * @param vehicle - the vehicle to add the rims to
     */
    public Rims(Vehicle vehicle){
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
    }
}
