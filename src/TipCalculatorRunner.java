import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //introduction
        System.out.println("----------------------------------");
        System.out.println("| Welcome to the Tip Calculator! |");
        System.out.println("----------------------------------");
        System.out.print("How many people are in your group? ");
        int totalPeople = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? (1-100) ");
        int tipPercent = scan.nextInt();
        scan.nextLine();

        //creates the tip calculator object
        TipCalculator calculator = new TipCalculator(totalPeople, tipPercent);

        //variables for the while loop//
        double updatePrice = 0;

        //iterates until the user types in -1
        while (updatePrice >=0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (Type -1 to end): ");
            calculator.addMeal(updatePrice);
            updatePrice = scan.nextDouble();
            scan.nextLine();
        }

        //prints total bill before tip + tip percentage
        System.out.println("---------------------------------------");
        String formattedBillBefore = formatter.format(calculator.getTotalBillBeforeTip());
        System.out.println("Total bill before tip: " + "$" + formattedBillBefore);
        System.out.println("Tip percentage: " + calculator.getTipPercent() + "%");


        //prints tip variable
        String formattedTip = formatter.format(calculator.tipAmount());
        System.out.println("Total Tip: " + "$" + formattedTip);

        //prints total bill with tip
        String formattedBill = formatter.format(calculator.totalBill());
        System.out.println("Total Bill with tip: " + "$" + formattedBill);

        //prints total bill before tip divided amongst totalPeople
        String formattedCost = formatter.format(calculator.perPersonCostBeforeTip());
        System.out.println("Per person cost before tip: " + "$" + formattedCost);

        //prints tip per person
        String formattedTipPer = formatter.format(calculator.perPersonTipAmount());
        System.out.println("Tip per person: " + "$" + formattedTipPer);

        //prints total cost per person
        String formattedTotalPer = formatter.format(calculator.perPersonTotalCost());
        System.out.println("Total cost per person: " + "$" + formattedTotalPer);
        System.out.println("---------------------------------------");

        //prints farewell
        System.out.println("Thank you for using the Tip Calculator!");
        scan.close();

    }
}


