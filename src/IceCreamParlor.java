//import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
//
//import java.util.*;
//
//public class IceCreamParlor {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int totalTrips = sc.nextInt();
//        for (int i =0; i < totalTrips; i++){
//            int money = sc.nextInt();
//            int totalFlavors = sc.nextInt();
//            int[] prices = new int[totalFlavors];
//            Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
//            for (int j = 0; j < totalFlavors; j++){
//                int price = sc.nextInt();
//                prices[j] = price;
//                dict.put(price, j);
//            }
//            Arrays.sort(prices);
//
//
//
//        }
//    }
//
//    public static ArrayList<Integer> binarySearch(int[] prices, int money){
//        int middle = prices.length / 2;
//        ArrayList<Integer> newIntList = new ArrayList<>();
//        if (prices[middle] == money){
//            for (int i = 0; i < money; i++){
//                newIntList.add(prices[i]);
//            }
//        }
//        if (prices[middle] > money){
//
//    }
//}
