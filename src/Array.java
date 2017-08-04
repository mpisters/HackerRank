import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] numbers = new int[total];
        for (int i = total -1; i >= 0; i--) {
            int number = sc.nextInt();
            numbers[i] = number;
        }
        printArray(numbers);
    }

    public static void printArray(int[] array){
        String strAr = "";
        for (int i = 0; i < array.length; i++){
            if (i ==0){
                strAr = strAr + array[i];
            }
            if (i != 0){
                strAr = strAr + " " + array[i];
            }
        }
        System.out.println(strAr);
    }
}

