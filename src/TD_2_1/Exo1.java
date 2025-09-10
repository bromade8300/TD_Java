package TD_2_1;

import java.util.Random;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        int tensDigit = number / 10;
        int result = tensDigit * 5;


        result = result + 4;


        result = result * 2;

        int unitsDigit = number % 10;
        result = result + unitsDigit;

        System.out.println("Devine ?");

        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();

        if(userNumber == number) {
            System.out.println("bravo");
        }
        else {
            System.out.println("not bravo");
        }
    }

}