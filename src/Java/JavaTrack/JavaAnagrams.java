package Java.JavaTrack;

import java.util.*;
import java.util.Map;

public class JavaAnagrams {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }

        private static boolean isAnagram(String a, String b) {
            char[] stringA = a.toLowerCase().toCharArray();
            char[] stringB = b.toLowerCase().toCharArray();
            java.util.Map<Character, Integer> dictofA = createDict(stringA);
            java.util.Map<Character, Integer> dictofB = createDict(stringB);
            return dictofA.equals(dictofB);
        }

        private static java.util.Map<Character, Integer> createDict(char[] word){
            java.util.Map<Character, Integer> dict = new java.util.HashMap<>();
            for(char letter : word){
                if (dict.containsKey(letter)){
                    dict.put(letter, dict.get(letter) + 1);
                } else {
                    dict.put(letter, 1);
                }
            }
            return dict;
        }


    }
