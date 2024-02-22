import java.util.ArrayList;
    /*
     * Car class
     * Defines the properties of the cars on the train 
     */
public class Car {

    
    private ArrayList<Passenger> listPassengers;
    private int maxCapacity;

     /*
     * Constructor that initializes the attributes of the Car class
     */
    public Car(int max){
        this.maxCapacity = max;
        this.listPassengers = new ArrayList<Passenger>(this.maxCapacity);
    }

    /*
    * Returns the number of Passengers on the car
    */
    private int size(){
        int size = this.listPassengers.size();
        return size;
    }

    /*
     * Returns the maximum capacity of each car
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /*
     * Returns the number of seats remaining
     */
    private int seatsRemaining(){
        int size = this.size();
        return this.maxCapacity - size;}

    /** Getters
     * @return the number of seats available
     */
    public int getseatsRemaining(){
        return this.seatsRemaining();
    }

    /*
     * Adds passengers to the car
     */
    private boolean addPassenger(Passenger p){
        int size = this.size();
        if (this.listPassengers.contains(p)){
            System.out.println("Passenger in car already");
        }

        else if (size == this.maxCapacity){
            System.out.println("Car filled already. So sorry!");
        }

        else{
            this.listPassengers.add(p);
        }
        return (this.listPassengers.contains(p));
    }

/**
     * Setter for adding passenger
     * @param p Passenger
     * @return T/F: Is passenger on car? Is there space for boarding?
     */
    public boolean setaddPassenger(Passenger p){
        return addPassenger(p);
    }

    /**
     * 
     * Removes passenger from car
     */
    private boolean removePassenger(Passenger p){
        int size = this.size();
        if (this.listPassengers.contains(p)){
            this.listPassengers.remove(p); 
            return true;
        }
        else{
            System.out.println("Passenger " + p + " not present");
            return false;
        }
    }

    /**
     * Compares balance to a proposed debit to ensure sufficient funds
     * @param Passenger p 
     * @return T/F: Is passenger present?
     */

    public boolean getremovePassenger(Passenger p){
        return this.removePassenger(p);
    }

    /*
     * Returns the passengers in your class
     */
    public String toString() {
        return "The passengers in you car are:" + this.listPassengers; //Do I put this in the String manifest?
    }

    /**
     * prints the passengers in the car if any
     */
    private void printManifest(){
            int size = this.size();
            if (size == 0){
                System.out.println("There are no passengers in your car");
            }
            else{
            for (Passenger element : this.listPassengers){
                System.out.println(element);}
            System.out.println("Done") ;

            }
        }

    /**
     * Getter for the printManifest class
     */
    public void getprintManifest(){ //What's sthe use when simply calling the new function(getter) gives me the hidden data
        printManifest();
    }

    /**
     * The main class to test the Car class works functionally
     */
    public static void main(String[] args){
        Car car1 = new Car(5);
        car1.getCapacity();
        
        Passenger passenger1 = new Passenger("Olohi");
        Passenger passenger2 = new Passenger("Karachi");

        car1.addPassenger(passenger1);
        car1.addPassenger(passenger2);

        car1.getremovePassenger(passenger2);
        //System.out.println(car1);
        car1.printManifest(); //Why isn't this line working? I don't know why my printManifest statement isn't working
    }
    
 
}

