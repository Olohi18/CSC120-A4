import java.util.ArrayList;

/**
 * Train class
 * Describes the feature of the Train
 */
public class Train {
    
    public Engine myEngine;
    public ArrayList<Car> listCars;
    public FuelType fuelType;
    public int nCars;
    public double fuelCapacity;

    /**
     * Initializes the constructor for the Train class
     */

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        Engine myEngine = new Engine(fuelType, 100);
        this.listCars = new ArrayList<Car>(this.nCars);
    }   

    /**
     * Returns the type of Engine
     */
    public Engine getEngine(){
        return this.myEngine;
    }

    /**
     * Returns the i'th car
     */

    public Car getCar(int i){
        return this.listCars.get(i);    
        }
    /**
     * Returns the total number of seats remaining on the train
     */
    public int seatsRemaining(){
        int seatsRem = 0;
        for (Car car : this.listCars){
            seatsRem += car.getseatsRemaining();
        }
        return seatsRem;
    }
    /**
     * Returns the maximum capacity on the train
     */
    public int getMaxCapacity(){
        int maxCapacity = 0;
        for (Car car : this.listCars){
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;      
    }

    /**
     * prints the passengers on every car
     */
    public void printManifest(){
        for (Car car : this.listCars){
            car.getprintManifest();
        }
      

    }
    /*
     * For testing basic functionality of the Train class
     */
    public static void main(String[] args) {
        Train train = new Train(FuelType.ELECTRIC, 100.0, 5, 5 );
        Car car1 = new Car(4);
        Car car2 = new Car(7);
        Car car3 = new Car(5);
        train.listCars.add(car1);
        train.listCars.add(car2);
        train.listCars.add(car3);
        Passenger p = new Passenger("Olohi");
        Passenger p2 = new Passenger("Jo");
        Passenger p3 = new Passenger("Britney");
        car1.setaddPassenger(p);
        car2.setaddPassenger(p2);
        car3.setaddPassenger(p3);
        train.printManifest();
    }

    



}
