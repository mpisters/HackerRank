import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by miche on 1-8-2017.
 */
public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        ArrayList<Character> even = new ArrayList<>();
        ArrayList<Character> odd = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            String word = sc.next();
            for (int j = 0; j < word.length(); j++) {
                char x = word.charAt(j);
                if (j % 2 == 0) {
                    even.add(x);
                }
                if (j % 2 != 0) {
                    odd.add(x);
                }
            }
            String evenStr = even.toString().replace(",", "")
                    .replace("[", ""). replace("]", "").replace(" ", "");
            String oddStr =odd.toString().replace(",", "")
                    .replace("[", ""). replace("]", "").replace(" ", "");
            System.out.println(evenStr + " " + oddStr);
            even.clear();
            odd.clear();
        }
    }
}
