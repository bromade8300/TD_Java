package TD_7.Exo1.Classes;

import TD_7.affichage.Couleur;
import TD_7.affichage.Ecran;

import java.util.ArrayList;
import java.util.List;

public class Oeuvre extends Ecran {
    private List<Forme> formes;

    public Oeuvre(int largeur, int hauteur) {
        super(largeur, hauteur);
        formes = new ArrayList<>();
    }

    public void superposer(Forme forme) {
        formes.add(forme);
    }

    public void dessiner() {
        for (int i = 0; i < this.getHeight(); i++) {

            for (int j = 0; j < this.getWidth(); j++) {

                Point p = new Point(j, i);
                Couleur couleurCourante = new Couleur(1, 1, 1);

                for (Forme f : formes) {
                    if (f.contientPoint(p)) {
                        couleurCourante = f.getCouleur();
                    }
                }

                this.setPixel(j, i, couleurCourante);
            }
        }
    }

}

