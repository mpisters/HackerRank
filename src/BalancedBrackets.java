import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for (int i = 0; i < total; i++) {
            String brackets = sc.next();
            countingBrackets(brackets);
        }
    }

    public static void countingBrackets(String brackets) {
        char[] charArr = brackets.toCharArray();
        int lengthChar =  charArr.length -1;
        Boolean balanced = true;
        for (int i= 0; i < charArr.length; i++) {

            char w = charArr[lengthChar];
            char v = charArr[0];
            if (i < charArr.length - 1) {
                char x = charArr[i];
                char y = charArr[lengthChar - i];
                char z = charArr[i + 1];
                if (x == '{' && y != '}') {
                    if (z != '}') {
                        balanced = false;
                    } else {
                        balanced = true;
                    }
                }
                if (x == '(' && y != ')') {
                    if (z != ')') {
                        balanced = false;
                    } else{
                        balanced = true;
                    }
                }
                if (x == '[' && y != ']') {

                    if (z != ']') {
                        balanced = false;

                    } else {
                        balanced = true;
                    }
                }
            }
            if (w == '{' || w == '[' || w=='('){
                balanced = false;
            }
            if ( v =='}' || v == ']' || v ==')'){
                balanced = false;
            }
        }
        if(balanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

