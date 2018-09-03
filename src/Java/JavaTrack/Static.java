package Java.JavaTrack;

import java.util.Scanner;

public class Static {
    private static int B;
    private static int H;
    private static boolean flag;
    static Scanner sc = new Scanner(System.in);

    static {
        B = sc.nextInt();
        H = sc.nextInt();
        flag = true;
        if (B < 1 || H < 1){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area = B *H;
            System.out.println(area);
        }
    }
}
