import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int index = 1;
        ArrayList<ArrayList<Integer>> allNumbers = new ArrayList<>();
        while(index < total+1){
            int totalQ = scanner.nextInt();
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < totalQ; i++){
                int nextNumber = scanner.nextInt();
                numberList.add(nextNumber);
            }
            allNumbers.add(numberList);
            index++;
        }
        int searchTotal = scanner.nextInt();
        for (int j = 0; j < searchTotal; j++){
                int searchNumber = scanner.nextInt();
                ArrayList<Integer> searchedList = allNumbers.get(searchNumber - 1);
                int indexNumber = scanner.nextInt();
                if (indexNumber <= searchedList.size()){
                    System.out.println(searchedList.get(indexNumber -1 ));
                } else {
                    System.out.println("ERROR!");
                }

        }
        scanner.close();
    }
}
