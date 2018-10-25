package Java.JavaTrack;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lengthStrings = A.length() + B.length();
        System.out.println(lengthStrings);
        String alphabeticallyCorrect = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(alphabeticallyCorrect);
        String capitalizedA = capitalizeWord(A);
        String capitalizedB = capitalizeWord(B);
        System.out.println(capitalizedA + " " + capitalizedB);
    }

    private  static String capitalizeWord(String word){
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
