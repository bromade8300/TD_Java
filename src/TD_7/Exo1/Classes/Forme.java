package TD_7.Exo1.Classes;

import TD_7.affichage.Couleur;

public class Forme {
    protected Couleur couleur;

    public Forme(Couleur couleur) {
        this.couleur = couleur;
    }

    public Couleur getCouleur() { return couleur; }
    public void setCouleur(Couleur couleur) { this.couleur = couleur; }

    public boolean contientPoint(Point point){
        throw new IllegalStateException("impossible à déterminer");
    }
}

