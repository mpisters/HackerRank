import java.util.Scanner;

public class Interfaces {
    interface AdvancedArithmetic{
        int divisorSum(int n);
    }

    static class Calculator2 implements AdvancedArithmetic{
        public int divisorSum(int n){
            int sum = 0;
            for (int i = 1; i < n+1; i++){
                if (n % i == 0){
                    sum+=i;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator2();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
