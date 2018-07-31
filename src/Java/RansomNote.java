import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by miche on 27-7-2017.
 */
public class RansomNote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sizeMag = sc.nextInt();
        int sizeNote = sc.nextInt();
        Map<String, Integer> magazineMap = new HashMap<>();
        Map<String, Integer> noteMap =  new HashMap<>();
        String[] mag = new String[sizeMag];
        String[] note = new String[sizeNote];
        boolean possible = true;
        for (int i =0; i < sizeMag; i++){
           mag[i] = sc.next().toLowerCase();
        }
        for (int j = 0; j < sizeNote; j++){
            note[j] = sc.next().toLowerCase();
        }
        for (String w: mag){
            Integer n = magazineMap.get(w);
            n = (n == null) ? 1: ++n;
            magazineMap.put(w,n);
        }

        for (int k = 0; k < note.length; k++){
            String x = note[k];
            Integer m = magazineMap.get(x);
            if (m == null || m <= 0){
                System.out.println("No");
                possible = false;
                break;
            } if (m > 0 ) {
                m--;
                magazineMap.put(x, m);
            }

        }
        if(possible){
            System.out.println("Yes");
        }
    }

}
