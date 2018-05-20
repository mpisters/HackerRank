import java.util.Scanner;

/**
 * Created by miche on 28-7-2017.
 */
public class Operators
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        scan.nextLine();
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * ((double) tipPercent / 100);
        double tax = mealCost * ((double) taxPercent / 100);
        double totalCost = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost
        int result = (int) Math.round(totalCost);

        // Print your result
        System.out.println("The total meal cost is " + result + " dollars.");
    }
}
