package Java.JavaTrack;

import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    }
}
