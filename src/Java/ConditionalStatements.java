import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";
        if (n >= 2 && n <= 5 && n % 2 == 0) {
            System.out.println("Not Weird");
        }
        if (n >= 6 && n <= 20 && n % 2 == 0) {
            System.out.println("Weird");
        }
        if (n > 20 && n % 2 == 0) {
            System.out.println("Not Weird");
        } if (n % 2 != 0){
            System.out.println("Weird");
        }
    }
}