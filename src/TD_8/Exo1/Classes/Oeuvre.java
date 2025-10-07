package TD_8.Exo1.Classes;

import TD_8.affichage.Couleur;
import TD_8.affichage.Ecran;

import java.util.ArrayList;
import java.util.List;

public class Oeuvre extends Ecran {
    private List<ElementGraphique> elementGraphiques;

    public Oeuvre(Resolution resolution) {
        super(resolution.getWidth(),resolution.getHeight());
        elementGraphiques = new ArrayList<>();
    }

    public void superposer(ElementGraphique elementGraphique)
    {
        elementGraphiques.add(elementGraphique);
    }

    public void dessiner() {
        for (int i = 0; i < this.getHeight(); i++) {

            for (int j = 0; j < this.getWidth(); j++) {

                Point p = new Point(j, i);
                Couleur couleurCourante = new Couleur(1, 1, 1);

                for (ElementGraphique f : elementGraphiques) {
                    if (f.evaluer(p) != null) {
                        couleurCourante = f.evaluer(p);
                    }
                }

                this.setPixel(j, i, couleurCourante);
            }
        }
    }

}

