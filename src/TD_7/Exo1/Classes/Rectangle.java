package TD_7.Exo1.Classes;

import TD_7.affichage.Couleur;

public class Rectangle extends Forme {
    private Point minimum;
    private Point maximum;

    public Rectangle(Point minimum, Point maximum, Couleur couleur) {
        super(couleur);
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @Override
    public boolean contientPoint(Point p) {
        boolean isInX = p.getX() >= minimum.getX() && p.getX() <= maximum.getX();
        boolean isInY = p.getY() >= minimum.getY() && p.getY() <= maximum.getY();

        return isInX && isInY;
    }
}

