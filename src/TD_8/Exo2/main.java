package TD_8.Exo2;

import TD_8.Exo2.Classes.GroupeDeMusique;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quelle est la durée de votre partition (en unités de temps) ? ");
        int duree = sc.nextInt();

        GroupeDeMusique groupe = new GroupeDeMusique(duree);
        groupe.jouer();
    }
}
