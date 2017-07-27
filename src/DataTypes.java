import java.util.Scanner;

/**
 * Created by miche on 27-7-2017.
 */
public class DataTypes {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double dob = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        System.out.println(number + i);
        System.out.println(dob +  d);
        System.out.println(s + str);
        scan.close();
    }
}
