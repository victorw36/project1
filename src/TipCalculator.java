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

        System.out.print("Enter a cost in dollars and cents (type -1 to end): ");
        double number = scan.nextDouble();
        scan.nextLine();

        while ( number != -1) {
            System.out.print("Enter a cost in dollars and cents (type -1 to end): ");
            scan.nextLine();
        }

        System.out.println("---------------------------------");
        scan.close();

    }
}
