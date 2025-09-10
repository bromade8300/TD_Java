package TD_2_5;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la hauteur du sapin : ");
        int hauteur = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < hauteur - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
