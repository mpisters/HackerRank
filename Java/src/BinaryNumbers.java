import javax.print.DocFlavor;
import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = 0;
        String binary = Integer.toBinaryString(number);
        int i = 0;
        int result = 0;
        while(i < binary.length()) {
            char x = binary.charAt(i);
            if (x == '1') {
                temp++;
            }
            if (x == '0') {
                if (temp > result){
                    result = temp;
                }
                temp = 0;
            }
            i++;
        }
        if (temp > result){
            result = temp;
        }
        System.out.println(result);
    }
}
