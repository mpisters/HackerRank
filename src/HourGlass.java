import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> HourGlasses = new ArrayList<>();
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 4; l++) {
                    int sum = arr[k][l] + arr[k][l + 1] + arr[k][l + 2] + arr[k + 1][l + 1] +
                            arr[k + 2][l] + arr[k + 2][l + 1] + arr[k + 2][l + 2];
                    HourGlasses.add(sum);
            }
        }

        int max = Collections.max(HourGlasses);
        System.out.println(max);
    }
}
