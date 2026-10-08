public class CreditCard {

    private String name;
    private double apr;
    private double balance;

    public CreditCard(String name, double apr, double balance) {
        this.name = name;
        this.apr = apr;
        this.balance = balance;
     }

     

     public String getName() {
         return name;
     }
     public String setName(String name) {
        this.name = name;
        return name;

     }

     public double getApr() {
         return apr;
     }
      public double setApr(double apr) {
        this.apr = apr;
        return apr;
      }

      public double getBalance() {
         return balance;
     }
     public double setBalance(double balance) {
        this.balance = balance;
        return balance;
     }

     @Override 
     public String toString() {
        return name + " " + " APR: " + apr + "% Balance: " + balance;
     }
}