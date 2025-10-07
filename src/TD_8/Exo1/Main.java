package TD_8.Exo1;

import TD_8.Exo1.Classes.*;
import TD_8.affichage.Couleur;

public class Main {


    public static void main (String [] args) {
        Couleur BLANC = new Couleur (1, 1, 1);
        Couleur BLEU_FONCE = new Couleur (0, 0, 0.2);
        Couleur BLEU = new Couleur (0, 0.4, 1);
        Couleur BLANC_CHAUD = new Couleur (1, 1, 0.8);
        Couleur VERT_TRES_CLAIR = new Couleur (0.1, 0.5, 0.15);
        Couleur VERT_CLAIR = new Couleur (0, 0.4, 0.1);
        Couleur VERT = new Couleur (0, 0.3, 0.05);
        Couleur VERT_SOMBRE = new Couleur (0, 0.2, 0.0);
        try {

            Resolution resolution = new Resolution (512, 512);
            Oeuvre oeuvre = new Oeuvre (resolution);

            Fond fond = new FondDegrade(BLEU_FONCE, BLEU,resolution);
            oeuvre.superposer (fond);

            Fond fondEtoile = new FondEtoile (resolution, BLANC_CHAUD, 200, 0.5, 2);
            oeuvre.superposer (fondEtoile);

            Forme montagneCentre = new Triangle (VERT_SOMBRE,new Point (320, 128), new Point (128, 384), new Point (512, 384) );
            oeuvre.superposer (montagneCentre);

            Forme montagneCentreNeige = new Triangle (BLANC,new Point (320, 128), new Point (272, 192), new Point (368, 192));
            oeuvre.superposer (montagneCentreNeige);

            Forme montagneGauche = new Triangle (VERT,new Point (128, 64), new Point (-64, 384), new Point (320, 384));
            oeuvre.superposer (montagneGauche);

            Forme montagneGaucheNeige = new Triangle (BLANC,new Point (128, 64), new Point (80, 144), new Point (176, 144));
            oeuvre.superposer (montagneGaucheNeige);

            Forme colline = new Disque (new Point (600, 576), 256, VERT_CLAIR);
            oeuvre.superposer (colline);

            Forme herbe = new Rectangle (new Point (0, 384), new Point (768, 512),VERT_TRES_CLAIR);
            oeuvre.superposer (herbe);

            System.out.println("--- Starting drawing process... ---");
            oeuvre.dessiner();
            new Thread(oeuvre).start();
            System.out.println("--- Drawing process finished successfully. ---");

        } catch (Exception e) {
            // If any unexpected exception occurs, it will be caught here.
            System.err.println("\n!!! An unexpected error occurred during execution !!!");
            e.printStackTrace(); // This prints the full error trace.
            System.err.println("!!! Program terminated with error. !!!\n");
        }
    }
}