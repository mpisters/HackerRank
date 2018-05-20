import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();
            String conversion = Integer.toString(number);
            System.out.println(conversion);
        } catch (InputMismatchException e) {
            System.out.println("Bad String");
        }
    }
}
