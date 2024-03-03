import java.util.ArrayList;

//Train class
public class Train {
    
    private Engine myEngine;
    private ArrayList<Car> listCars;
    private FuelType fuelType;
    private int nCars;
    private double fuelCapacity;
    

    /**
     * Initializes the constructor for the Train class
     * @param fuelType, fuelCapacity, number of Cars, passenger Capacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        Engine myEngine = new Engine(fuelType, 100);
        this.listCars = new ArrayList<Car>(this.nCars);
    }   

    /**
     * Getter for Engine type
     * @return type of Engine
     */
    public Engine getEngine(){
        return this.myEngine;
    }

    /** Getter for Car class. Returns the i'th car
     * @param i, number of car in car order
     * @return car
     */
    public Car getCar(int i){
        return this.listCars.get(i);    
        }

    /**
     * Returns the total number of seats remaining on the train
     * @return total number of seatsRemaining across all cars
     */
    public int seatsRemaining(){
        int seatsRem = 0;
        for (Car car : this.listCars){
            seatsRem += car.seatsRemaining();
        }
        return seatsRem;
    }

    /**
     * Returns the total maximum capacity of the cars on the train
     * @return maxCapacity
     */
    public int getMaxCapacity(){
        int maxCapacity = 0;
        for (Car car : this.listCars){
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;      
    }

    /**
     * prints out the names of the passengers on the train
     */
    public void printManifest(){
        for (Car car : this.listCars){
            car.printManifest();
        }
      

    }
    // For testing basic functionality of the Train class
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
        car1.addPassenger(p);
        car2.addPassenger(p2);
        car3.addPassenger(p3);
        train.printManifest();
    }

    



}
