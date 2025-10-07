package TD_8.Exo1.Classes;

import TD_8.affichage.Couleur;

import java.util.Random;

public class FondEtoile extends Fond {
    private Disque[] etoiles;

    public FondEtoile(Resolution resolution, Couleur couleur,int nbEtoile,double rMin,double rMax) {
        super(resolution);
        this.etoiles = new Disque[nbEtoile];
        Random rand = new Random();

        for (int i = 0; i < nbEtoile; i++) {
            int x = rand.nextInt(resolution.getWidth());
            int y = rand.nextInt(resolution.getWidth());

            double rayon = rMin + rand.nextDouble(rMax - rMin + 1);


            etoiles[i] = new Disque(new Point(x, y), rayon, couleur);
        }
    }

    @Override
    public TD_8.affichage.Couleur evaluer(Point point) {
        // Vérifie si le point appartient à au moins une étoile
        for (Disque etoile : etoiles) {
            if (etoile.contientPoint(point)) {
                return etoile.getCouleur();
            }
        }
        return null; // sinon pas d'étoile à cet endroit
    }
}
