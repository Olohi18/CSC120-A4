
/*
 * The engine class
 * Controls the motion of the car
 * Moves only when fuel available
 */
public class Engine {

    public FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    /*
     * Initializes the attributes for the Engine class
     */
    public Engine(FuelType fuelType, double currentFuel) {
        this.fuelType = FuelType.ELECTRIC;
        this.currentFuel = currentFuel;
        this.maxFuel = 500.00;
    }

    /*
     * Sets the fuel in the engine to the fuel's maximum capacity
     */

    public void refuel() {
        this.currentFuel = this.maxFuel;
    }

    /*
     * Sets the engine in motion when fuel available
     */
    public boolean go() {
        double value = 10.00;
        this.currentFuel -= value; // setcurrentFuel(value)
        System.out.println(this.currentFuel);
        return (this.currentFuel > 0);
    }

    /*
     * Prints out the amount of fuel left in engine
     */
    public String toString() {
        return "The fuel left in your engine is:" + this.currentFuel;
    }

    /**
     * Getter for current fuel available
     * 
     * @return the amount of fuel left
     */
    public double getcurrentFuel() {
        return this.currentFuel;
    }

    /**
     * Setter for reducing the value of available fuel
     * @param currentFuel, updates amount of fuel
     */
    public void setcurrentFuel(double x) {
        this.currentFuel -= x;
    }

    /*
     * For testing basic functionality of engine class
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}