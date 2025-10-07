package TD_8.Exo1.Classes;

import TD_8.affichage.Couleur;

public class Triangle extends Forme {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Couleur couleur, Point a, Point b, Point c) {
        super(couleur);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean contientPoint(Point point) {
        double apx = point.getX() - a.getX();
        double apy = point.getY() - a.getY();

        double bpx = point.getX() - b.getX();
        double bpy = point.getY() - b.getY();

        double cpx = point.getX() - c.getX();
        double cpy = point.getY() - c.getY();

        double cpa = apx * bpy - apy * bpx;
        double cpb = bpx * cpy - bpy * cpx;
        double cpc = cpx * apy - cpy * apx;

        boolean da = (cpa > 0);
        boolean db = (cpb > 0);
        boolean dc = (cpc > 0);

        return da == db && db == dc;
    }
}
