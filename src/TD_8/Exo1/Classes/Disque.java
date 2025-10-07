package TD_8.Exo1.Classes;

import TD_8.Exo1.Classes.Forme;
import TD_8.Exo1.Classes.Point;
import TD_8.affichage.Couleur;

public class Disque extends Forme {
    private Point centre;
    private double rayon;

    public Disque(Point centre, double rayon, Couleur couleur) {
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

