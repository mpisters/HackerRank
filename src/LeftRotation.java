import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by miche on 26-7-2017.
 */
public class LeftRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int lengthArray = sc.nextInt();
            int rotation = sc.nextInt();
            int[] origList = new int[lengthArray];
            for (int i = 0; i < lengthArray; i++){
                int number = sc.nextInt();
                origList[i] = number;
            }
            int[] newArray = rotateArray(origList, rotation);
            System.out.println(Arrays.toString(newArray));

        }
    }
    public static int[] rotateArray(int[] origin, int rotation){
        int[] temp = new int[rotation];
        int[] newArray = new int[origin.length];
        for (int i = 0; i < rotation; i++){
            temp[i] = origin[i];
        }
        int k = 0;
        for (int j = rotation; j < origin.length; j++){
            newArray[k] = origin[j];
            k++;
        }
        int difference = origin.length - rotation;
        int m = 0;
        for (int l = difference; l < origin.length; l++ ){
            newArray[l] = temp[m];
            m++;
        }
        return newArray;
    }
}
