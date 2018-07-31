package Java.JavaTrack;

import java.util.Scanner;

public class Loop {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String output = "";
        for (int i = 1; i <= 10; i++){
            String result = N + " x " + i + " = " + i * N;
            output = output + result + "\n";
        }
        System.out.println(output);
        scanner.close();
    }
}
