import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneBook {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int keyPairs = sc.nextInt();
        Map<String, String> dict = new HashMap<String, String>();
        for (int i = 0; i < keyPairs; i++){
            String name = sc.next();
            String phone = sc.next();
            dict.put(name, phone);
        }
        while(sc.hasNext()){
            String name = sc.next();
            String phone = dict.get(name);
            if (phone == null){
                System.out.println("Not found");
            } else {
                System.out.println(name+"="+phone);
            }
        }
        sc.close();
    }
}
