package TD_8.Exo1.Classes;

import TD_8.Exo1.Classes.Point;
import TD_8.affichage.Couleur;

public abstract class Forme extends ElementGraphique {
    private Couleur couleur;

    public Forme(Couleur couleur) {
        this.couleur = couleur;
    }

    public Couleur getCouleur() { return couleur; }
    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public abstract boolean contientPoint(Point point);

    public final Couleur evaluer(Point point){
        if(contientPoint(point))
            return couleur;
        else
            return null;
    }


}

