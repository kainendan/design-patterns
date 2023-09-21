package factory;

/*
 * Class for a bike store
 * @param type String describing the type of bike
 */
public class BikeStore {
    public Bike createBike(String type){
        Bike bike = null;
        if (type.equals("tricycle")){
            bike = new Tricycle();
        } else if (type.equals("strider")){
            bike = new Strider();
        } else if (type.equals("kids bike")){
            bike = new KidsBike();
        }
        return bike;
    }
}
