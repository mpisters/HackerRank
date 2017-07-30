import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by miche on 29-7-2017.
 */
public class Queues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalQueues = sc.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < totalQueues; i++){
            int type = sc.nextInt();
            if (type == 1){
                int newNumber = sc.nextInt();
                intList.add(newNumber);
            }
            if (type == 2){
                intList.remove(0);
            }
            if (type == 3){
                int firstNumber = intList.get(0);
                System.out.println(firstNumber);
            }
        }
    }
}
