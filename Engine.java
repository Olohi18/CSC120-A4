import FuelType;
//import FuelType;

public class Engine {

    public String fuelType ;
    public double currentFuel;
    public double maxFuel;

    public Engine(String fuelType, double currentFuel, double maxFuel){
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    public void refuel(){
        this.currentFuel =  this.maxFuel;
    }

    public boolean go(){
        double value = 5.00;
        this.currentFuel -= value;
        System.out.println(this.currentFuel);
        return (this.currentFuel > 0);
    } 

}