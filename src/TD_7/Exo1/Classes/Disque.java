package TD_7.Exo1.Classes;

import TD_7.affichage.Couleur;

public class Disque extends Forme {
    private Point centre;
    private int rayon;

    public Disque(Point centre, int rayon, Couleur couleur) {
        super(couleur);
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public boolean contientPoint(Point p) {
        int dx = p.getX() - centre.getX();
        int dy = p.getY() - centre.getY();

        return dx * dx + dy * dy <= rayon * rayon;
    }
}

