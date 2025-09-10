package TD_2_2;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le coût total des marchandises : ");
        double coutTotal = scanner.nextDouble();

        System.out.print("Entrez l'argent que donne le client : ");
        double argentDonne = scanner.nextDouble();

        if (argentDonne < coutTotal) {
            System.out.println("L'argent donné est insuffisant.");
            scanner.close();
            return;
        }

        int changeCents = (int) Math.round((argentDonne - coutTotal) * 100);

        System.out.println("Voici la monnaie à rendre :");

        // Billets de 500 euros
        int billets500 = changeCents / 50000;
        if (billets500 > 0) {
            System.out.println("- Billets de 500 euros : " + billets500);
            changeCents %= 50000;
        }

        // Billets de 200 euros
        int billets200 = changeCents / 20000;
        if (billets200 > 0) {
            System.out.println("- Billets de 200 euros : " + billets200);
            changeCents %= 20000;
        }

        // Billets de 100 euros
        int billets100 = changeCents / 10000;
        if (billets100 > 0) {
            System.out.println("- Billets de 100 euros : " + billets100);
            changeCents %= 10000;
        }

        // Billets de 50 euros
        int billets50 = changeCents / 5000;
        if (billets50 > 0) {
            System.out.println("- Billets de 50 euros : " + billets50);
            changeCents %= 5000;
        }

        scanner.close();
    }
    }
