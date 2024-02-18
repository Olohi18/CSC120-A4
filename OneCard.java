public class OneCard{
    
    private String name;
    private double balance;

    public OneCard(String name, double balance) {
        this.name = name;
        this.balance = balance;
    } 

    /**
     * Getter for name
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     * @param newName updated name
     */
    public void setName(String newName) {
        this.name = newName;
    }
    
    /**
     * Increase the balance on a OneCard
     * @param amt amount to add
     */
    public void deposit(double amt) {
        this.balance += amt;
    }

    /**
     * Compares balance to a proposed debit to ensure sufficient funds
     * @param amt Proposed charge
     * @return T/F: does account have sufficient balance to cover amt
     */
    public boolean canAfford(double amt) {
        return this.balance >= amt;
    }

    public String toString() {
        return this.name + "'s OneCard has a balance of $" + this.balance;
    }

    public static void main(String[] args) {
        OneCard myCard = new OneCard("Johanna", 10.0);
        System.out.println(myCard);
        myCard.setName("Jordan");
        myCard.deposit(10.0);
        System.out.println(myCard);
    }
}