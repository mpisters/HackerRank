import java.util.Scanner;

class Difference2 {
    private int[] elements;
    public int maximumDifference;
    protected int maxValue;
    protected int minValue;

    public Difference2(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference(){
        this.maxValue = this.elements[0];
        this.minValue = this.elements[0];
        for (int i = 0; i < this.elements.length ;i++){
            if(this.maxValue < Math.abs(this.elements[i])){
                this.maxValue = Math.abs(this.elements[i]);
            }
            if(this.minValue > Math.abs(this.elements[i])){
                this.minValue = Math.abs(this.elements[i]);
            }
        }
        return this.maximumDifference = maxValue - minValue;

    }
}




public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference2 difference2 = new Difference2(a);

        difference2.computeDifference();

        System.out.print(difference2.maximumDifference);
    }
}
