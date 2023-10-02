import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to the Rong Restuarant. How many people will be eating: ");
        int people = scan.nextInt();
        scan.nextLine();

        System.out.print("What is the tip percentage? (1-100): ");
        int tipPercent = scan.nextInt();
        scan.nextLine();

        System.out.print("type a number you would rather split the bill by(type same number of people if you don't need): ");
        int differentNumber =scan.nextInt();


        double total = 0;

        System.out.print("Enter a cost in dollars and cents (type done to end): ");

        // loop for prices
        while(scan.hasNextDouble()) {
            System.out.print("Enter a cost in dollars and cents (type done to end): ");
            double number =scan.nextDouble();
            total = total + number;
        }
//rounding to nearest 100ths
        total = Math.round(total * 100.0) / 100.0;

        double tipMoney = (tipPercent / 100.0 * total);
        tipMoney = Math.round(tipMoney * 100.0) / 100.0;

        double tipPerPerson = tipMoney / people;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

        double totalPerPerson = total / people;
        totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;

        double totalWithTip = tipMoney + total;
        double realCostPerson = totalWithTip / people;
        realCostPerson = Math.round(realCostPerson * 100.0) / 100.0;




        //printing the products
        System.out.println("---------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage is: " + tipPercent + "%");
        System.out.println("Total tip: $" + tipMoney);
        System.out.println("Total bill with tip: $" + totalWithTip);
        System.out.println("Per person cost before tip: $" + totalPerPerson);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + realCostPerson);
        System.out.println("---------------------------------");


        //freestyle, splitting bill by a different number
        double newCostPerson = totalWithTip / differentNumber;
        System.out.println("The new cost per person is: $" + newCostPerson);

        scan.close();

        System.out.print("bye bye buddy");
    }
}
