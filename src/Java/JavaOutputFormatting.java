package Java;

import java.util.Collections;
import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            sc.nextLine();
            String newString = String.format("%1$-15s", s1);
            System.out.println(newString + String.format("%03d", x));
        }
        System.out.println("================================");
    }
}






