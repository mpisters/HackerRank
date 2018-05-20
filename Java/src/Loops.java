import java.util.Scanner;

/**
 * Created by miche on 31-7-2017.
 */
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i < 11; i++){
            int result = i * number;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
