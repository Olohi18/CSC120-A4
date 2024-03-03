import java.util.ArrayList;
    /*
     * Car class
     * Defines the properties of the cars on the train 
     */
public class Car {

    
    private ArrayList<Passenger> listPassengers;
    private int maxCapacity;

     /**
      * Constructor that initializes the attributes of the Car class
      * @param int max, maximum capacity of car
      */
    public Car(int max){
        this.maxCapacity = max;
        this.listPassengers = new ArrayList<Passenger>(this.maxCapacity);
    }

    /**
    * Reflects the number of Passengers on the car
    * @return number of passengers in the given car
    */
    private int size(){
        int size = this.listPassengers.size();
        return size;
    }

    /**
     * Getter for maximum capacity of car
     * @return maximum capacity of the car
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
     * Shows the number of available seats remaining
     * @return this.maxCapacity - size
     */
    public int seatsRemaining(){
        int size = this.size();
        return this.maxCapacity - size;
    }

    /**
     * Adds passengers to the car
     * @param p, passenger to be added
     * @return T/F, does car contain p?
     */
    public boolean addPassenger(Passenger p){
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
     * Removes passenger from car
     * @param p, Passenger to be removed
     * @return T/F. Was passenger added successfully?
     */
    public boolean removePassenger(Passenger p){
        if (this.listPassengers.contains(p)){
            this.listPassengers.remove(p);
            System.out.println("Removing " + p); 
            return true;
        }
        else{
            System.out.println("Passenger " + p + " not present");
            return false;
        }
    }

    //prints the list of passengers boarded
    public String toString() {
        return "The passengers in you car are:" + this.listPassengers; //Do I put this in the String manifest?
    }

    /**
     * prints the passengers in the car if any
     */
    public void printManifest(){
            int size = this.size();
            if (size == 0){
                System.out.println("There are no passengers in your car");
            }
            else{
            for (Passenger element : this.listPassengers){
                System.out.println(element);}
            System.out.println("Done!") ;

            }
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

        car1.removePassenger(passenger2);
        car1.printManifest();
    
 
}}

