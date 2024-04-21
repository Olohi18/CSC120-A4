
/*
 * The engine class
 * Controls the motion of the car
 * Moves only when fuel available
 */
public class Engine {

    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    /**
     * Initializes Engine class attributes
     * @param fuelType and currentFuel level
     */
    public Engine(FuelType fuelType, double currentFuel) {
        this.fuelType = FuelType.ELECTRIC;
        this.currentFuel = currentFuel;
        this.maxFuel = 500.0;
    }

    /**
     * Sets fuel level in the engine to the maximum capacity
     */
    public void refuel() {
        this.currentFuel = this.maxFuel;
    }

    /**
     * Sets the engine in motion when fuel available
     * @return T/F, is currentFuel level sufficient?
     */
    public boolean go() {
        int value = 1;
        if (currentFuel > 0){
        this.currentFuel -= value;} // setcurrentFuel(value)
        System.out.println(this.currentFuel);
        return (this.currentFuel > 0);
    }

    // Prints out the amount of fuel left in engine
    public String toString() {
        return "The fuel left in your engine is:" + this.currentFuel;
    }

    /**
     * Getter for currentFuel class
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

    // main function to test basic functionality of the engine class
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 112.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}