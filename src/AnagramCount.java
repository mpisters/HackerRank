import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by miche on 26-7-2017.
 */
public class AnagramCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String aStr = sc.nextLine();
        String bStr = sc.nextLine();
        char[] stringLista= aStr.toCharArray();
        char[] stringListb = bStr.toCharArray();
        char a = 'a';
        int[] count = new int[26];
        for (int i = 0; i < stringLista.length; i++){
            count[stringLista[i] - a]++;
        }
        for (int i = 0; i < stringListb.length; i++){
            count[stringListb[i] - a]--;
        }
        int sum = 0;
        for(int i = 0 ; i < count.length ;i++){
            sum+= Math.abs(count[i]);
        }

        System.out.println(sum);

    }


}
