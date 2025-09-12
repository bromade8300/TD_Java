package TD_3;

import java.util.Scanner;

public class PuissanceQuatre {
	static Scanner scanner = new Scanner(System.in);
    static final int VIDE = 0;
    static final int ROUGE = 1;
    static final int JAUNE = 2;

    public static int[][] nouvelleGrille(int largeur, int hauteur) {
        int[][] grille = new int[largeur][hauteur];
        for (int i = 0; i <largeur; i++) {
            for (int j = 0; j <hauteur; j++) {
                grille[i][j] = VIDE;
            }
        }
        return grille;
    }
    
    public static void displayCellValue(int cellValue) {
        switch (cellValue) {
        case VIDE:
            System.out.print("| |");
            break;
        case ROUGE:
            System.out.print("|R|");
            break;
        case JAUNE:
            System.out.print("|J|");
            break;
    }
    }

    public static void afficheGrille(int[][] grille) {
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[i].length; j++) {
                int cellValue = grille[i][j];
                displayCellValue(cellValue);

            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i = 1;i<=grille[0].length;i++) {
        	System.out.print("|"+i+"|");
        }
        System.out.println();
        
    }

    public static boolean grilleGagnante(int[][] grille) {
        for (int joueur = 1; joueur <= 2; joueur++) {
            // Check for horizontal wins
            for (int i = 0; i < grille.length; i++) {
                if (DroiteGagnante(grille[i], joueur)) {
                    return true;
                }
            }

            // Check for vertical wins
            int[] colonne = new int[grille.length];
            for (int j = 0; j < grille[0].length; j++) {
                for (int i = 0; i < grille.length; i++) {
                    colonne[i] = grille[i][j];
                }
                if (DroiteGagnante(colonne, joueur)) {
                    return true;
                }
            }

            // Check for diagonal wins
            if (diagonaleGagnante(grille, joueur)) {
                return true;
            }
        }
        return false;
    }

    public static boolean diagonaleGagnante(int[][] grille, int joueur) {
        int rows = grille.length;
        int cols = grille[0].length;

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                int cptStreak = 0;
                for (int k = 0; k < 4; k++) {
                    if (grille[i + k][j + k] == joueur) {
                        cptStreak++;
                    } else {
                        cptStreak = 0;
                    }
                }
                if (cptStreak == 4) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = cols - 1; j >= 3; j--) {
                int cptStreak = 0;
                for (int k = 0; k < 4; k++) {
                    if (grille[i + k][j - k] == joueur) {
                        cptStreak++;
                    } else {
                        cptStreak = 0;
                    }
                }
                if (cptStreak == 4) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean DroiteGagnante(int[] droite, int joueur) {
        int cptStreak = 0;
        for (int i = 0; i < droite.length; i++) {
            if (droite[i] == joueur) {
                cptStreak++;
            } else {
                cptStreak = 0;
            }

            if (cptStreak == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean joueJeton(int[][] grille, int colonne, int joueur) {

        if (colonne < 0 || colonne >= grille[0].length) {
            System.out.println("numéro de colonne invalide");
            return false;
        }


        for (int i = grille.length - 1; i >= 0; i--) {
        	
            if (grille[i][colonne] == 0) {
            	// normal play
            	grille[i][colonne] = joueur;
                grille[i][colonne] = joueur;
                afficheGrille(grille);
            	
                
            	colonne++;
                System.out.println("Jeton du joueur " + joueur + " placé en colonne " + colonne + ".");
                return true;
            }
        }

        colonne++;
        System.out.println("Erreur : La colonne " + colonne + " est pleine.");
        return false; // can't place it
    }

    public static int demanderColonne(Scanner scanner){
        System.out.println("jouer dans la col n° ?");
        int numColonne = scanner.nextInt();
        return numColonne-1;
    }

    public static boolean tourJoueur(int [] [] grille, String nomJoueur, int couleur,Scanner scanner)  {
        boolean hasWin = false;
        
        int numCol = demanderColonne(scanner);
        
        // launch play sequence
        if(!joueJeton(grille, numCol, couleur)){
            numCol =   demanderColonne(scanner);
        }
        
        // check hasWin
        hasWin = grilleGagnante(grille);
        return hasWin;
    }
    
    static void CycleParty(int[][]grille) {
        boolean hasWin = false;
        int tourJoueur = ROUGE;
        
        do {
            hasWin = tourJoueur(grille,"antoine",tourJoueur,scanner);
            if(!hasWin){
                switch(tourJoueur){
                    case ROUGE:
                        tourJoueur = JAUNE;
                        break;
                    case  JAUNE:
                        tourJoueur = ROUGE;
                            break;
                }
            }
        } while(!hasWin);
        
        System.out.println("Le joueur " + tourJoueur + " a gagné !");
    }
    
    public static void main(String[] args) {
        int[][] grille = nouvelleGrille(7, 6);
        
        afficheGrille(grille);
        CycleParty(grille);
        
        scanner.close();
    }
}
