package TD_2_4;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int r = Math.max(a,b)-Math.min(a,b);
        int pgcd;
        if(r==0)
        {
            pgcd = Math.min(a,b);
        } else{
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            pgcd = a;
        }
    }
}
