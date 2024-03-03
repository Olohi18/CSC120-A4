/*
* Passenger class
* Defines the properties of the passengers on the train 
*/
public class Passenger {

    /**
     * @param name, name of Passenger
     */
    private String name;
    public Passenger(String name) {
        this.name = name;
    }

    // prints name of boarded passengers
    public String toString() {
        return this.name;
    }

    /**
     * Boards passengers
     * @param c, car to be boarded
     */
    public void boardCar(Car c) {
        if (c.setaddPassenger(this) == false) { // What's the function of this?
            System.out.println("Car filled! Try another car");

        }
    }

    /**
     * Removes passengers from car
     * @param c, car
     */
    public void getOffCar(Car c) {
        if (c.getremovePassenger(this) == false) {
            System.out.println("Check the other cars");
        }
    }

    /**
     * @param args
     * Main function to test functionality of Passenger class 
     */
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Olohi");
        Car car1 = new Car(5);
        passenger1.boardCar(car1);
        car1.getprintManifest();
        passenger1.getOffCar(car1);
        car1.getprintManifest();
    }
}
