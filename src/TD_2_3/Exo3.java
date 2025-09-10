package TD_2_3;

import java.util.Random;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        int difficulty;
        Scanner sc = new Scanner(System.in);
        difficulty = sc.nextInt();

        Random random = new Random();

        int randomNumber = random.nextInt(20);
        int d20Result = randomNumber + 1;
        System.out.println("d20 result: " + randomNumber);
        System.out.println("relance ?");
        boolean reroal = sc.nextBoolean();
        while(reroal){
            randomNumber =  random.nextInt(20);
            d20Result = randomNumber + 1;
            System.out.println("d20 result: " + randomNumber);
            System.out.println("relance ?");
            reroal = sc.nextBoolean();
        }

        switch(d20Result){
            case 1:
                System.out.println("rip");
                break;
            case 20:
                System.out.println("GG");
                break;

                default:
                    if(d20Result>=difficulty){
                        System.out.println("ça passe");
                    }else {
                        System.out.println("rip tu tombes");
                    }
                    break;
        }

    }
}
