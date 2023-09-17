package decorator;

import java.util.ArrayList;

/*
 * Class for the car
 */
public class Car extends Vehicle{

    /*
     * Constructor for the car
     */
    public Car() {
        super(FileReader.getLines("decorator/txt/car.txt"));
    }
}
