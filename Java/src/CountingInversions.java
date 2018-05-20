import java.util.Arrays;
import java.util.Scanner;

class countInversions {
    public static long swaps = 0;
}

public class CountingInversions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j <  n; j++){
                arr[j] = sc.nextInt();
            }
            int[] newArray = mergesort(arr);
            System.out.println(countInversions.swaps);
            countInversions.swaps = 0;
        }

    }

    public static int[] mergesort(int[] array){
        mergesort(array, new int[array.length], 0, array.length -1);
        return array;
    }

    public static void mergesort(int[] array, int[] temp, int leftStart, int rightEnd){
        if (leftStart >= rightEnd){
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergesort(array, temp, leftStart,  middle);
        mergesort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);

    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        while (left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp[index] = array[left];
                left++;
            } else{
                temp[index] = array[right];
                right++;
                countInversions.swaps = countInversions.swaps + (rightStart - left);
            }
            index++;
        }
        System.arraycopy(array, left, temp, index, leftEnd-left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart,size);

    }
}
