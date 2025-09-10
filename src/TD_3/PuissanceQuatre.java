package TD_3;

public class PuissanceQuatre {
    static final int VIDE = 0;
    static final int ROUGE = 1;
    static final int JAUNE = 2;

    public static int[][] nouvelleGrille(int largeur, int hauteur) {
        int[][] grille = new int[largeur][hauteur];
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < hauteur; j++) {
                grille[i][j] = 0;
            }
        }
        return grille;
    }

        public static void afficheGrille(int[][] grille){
            for(int i=0;i<grille.length;i++){
                for(int j=0;j<grille[i].length;j++){
                    int cellValue = grille[i][j];
                    switch (cellValue) {
                        case VIDE:
                                System.out.print("||");
                            break;
                            case ROUGE:
                                System.out.print("|R|");
                                break;
                                case JAUNE:
                                    System.out.print("|J");
                                    break;
                    }

                }
                System.out.println();
            }
        }

        public boolean grilleGagnante(int[][] grille){
        return true;
        }

        public boolean diagonaleGagnante(int[][] grille,int joueur){
            int cptStreak = 0;
            int lastCpt;
            int lastCellValue;
            int lastCellDiagonal;
        for(int i=0;i<grille.length;i++){
            for(int j=0;j<grille[i].length;j++){
                int cellValue = grille[i][j];
                int diagCellValue = grille[j-1][i-1];
                if (cellValue == joueur && cellValue == diagCellValue && cellValue == cptStreak) {
                    cptStreak++;
                }

                if(cptStreak == 4){
                    return true;
                }
            }
        }
        }

        public boolean DroiteGagnante(int[] droite, int joueur){
        int cptStreak = 0;
        int lastCpt;
            for (int i = 0; i < droite.length; i++) {

                lastCpt = droite[i];

                if (droite[i] == joueur && droite[i] == lastCpt) {
                    cptStreak++;
                }

                if(cptStreak == 4){
                    return true;
                }

            }
        return false;
        }

    public static void main(String[] args)
    {
        int[][] test = nouvelleGrille(8,8);
        afficheGrille(test);
    }
}
