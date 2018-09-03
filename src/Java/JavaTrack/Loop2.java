package Java.JavaTrack;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String sumList = "";
            int totalB = 0;
            int sum;
            for (int k = 0; k < n; k++) {
                totalB = totalB + (int) Math.pow(2, k) * b;
                sum = a + totalB;
                sumList = sumList.concat(sum + " ");
            }
            System.out.println(sumList);
        }
        in.close();
    }
}
