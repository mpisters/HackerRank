package Java.JavaTrack;


import java.util.Scanner;


public class JavaStringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    private static String getSmallestAndLargest(String s, int k) {
        java.util.TreeSet<String> vowels = new java.util.TreeSet<>();
        for (int i = 0; i <= s.length() - k; i++ ){
            String vowel = s.substring(i, i+k);
            vowels.add(vowel);
        }
        return vowels.first() + "\n" + vowels.last();
    }


}
