public class TipCalculator {

    //instance variables
    private int people;
    private double price;
    private int percent;
    private double accumulatedBill;

    public TipCalculator (int people, int percent) {
        this.people = people;
        this.percent = percent;
        price = 0;
        accumulatedBill = 0;
    }

    public void totalBill (double price) {
        accumulatedBill += price;
    }


}
