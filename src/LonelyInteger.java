import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LonelyInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] numbers = new int[number];
        int unique = numbers[0];
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < number; i++){
            numbers[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(numbers);
        if(numbers.length == 1){
            System.out.println(numbers[0]);
        } else {
            for (int j = 0; j < numbers.length; j++) {
                int total = count.containsKey(numbers[j]) ? count.get(numbers[j]) : 0;
                count.put(numbers[j], total + 1);
            }
            unique = getUniqueInt(count);
            System.out.println(unique);
        }
    }

    public static int getUniqueInt(Map<Integer,Integer> count){
        for (int key: count.keySet()){
            int value = count.get(key);
            if (value == 1){
                return key;
            }
        }
        return -1;
    }
}
