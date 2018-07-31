import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by miche on 26-7-2017.
 */
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int lengthArray = sc.nextInt();
            int[] firstList = new int[lengthArray];
            for (int i = 0; i < lengthArray; i++){
                firstList[i] = sc.nextInt();
            }
            int temp;
            int swaps = 0;
            for (int k = 0; k < firstList.length; k++ ){
                for (int j = 1; j < firstList.length -k; j++){
                    if (firstList[j - 1] > firstList[j]) {
                        temp = firstList[j];
                        firstList[j] = firstList[j-1];
                        firstList[j-1] = temp;
                        swaps++;
                    }
                }

            }
            System.out.println("Array is sorted in " + swaps + " swaps.");
            System.out.println("First Element: " + firstList[0]);
            System.out.println("Last Element: " + firstList[firstList.length -1]);
        }
    }
}
