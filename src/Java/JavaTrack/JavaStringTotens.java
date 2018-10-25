package Java.JavaTrack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaStringTotens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawString = scanner.nextLine();
        String newString = rawString.replaceAll("[^A-Za-z]", " ");
        String[] tokens = newString.split(" ");
        List<String> newTokens = Arrays.stream(tokens).filter(token -> token.length() > 0 ).collect(Collectors.toList());
        System.out.println(newTokens.size());
        for (String token : newTokens){
            System.out.println(token);
        }
    }
}
