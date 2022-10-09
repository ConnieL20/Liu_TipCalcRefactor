public class TipCalculator {

    //instance variables
    private int people;
    private int percent;
    private double totalBillBeforeTip;


    //constructor
    public TipCalculator (int people, int percent) {
        this.people = people;
        this.percent = percent;
        totalBillBeforeTip = 0.0;
    }

    //method that increments total bill before tip
    public double addMeal(double cost) {
        totalBillBeforeTip += cost;
        return totalBillBeforeTip;
    }

    //getter method that returns the total bill before tip
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    //getter method that returns the tip
    public int getTipPercent(){
        return percent;
    }

    //method that calculates and returns a double representing th total tip amount
    public double tipAmount(){
        return totalBillBeforeTip * (double)percent / 100;

    }

    //method that calculates and returns a double representing the total bill WITH tip
    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    //method that calculates and returns a double representing per person cost before tip
    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip/people;
    }

    //method that calculates and returns a double representing per person tip amount
    public double perPersonTipAmount() {
        return tipAmount()/people;
    }

    //method that calculates and returns a double representing the total cost per person
    public double perPersonTotalCost() {
        return totalBill()/people;
    }
}
