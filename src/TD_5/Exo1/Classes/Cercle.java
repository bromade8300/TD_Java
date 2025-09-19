package TD_5.Exo1.Classes;

public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setRayon(int rayon) {
        if(rayon>0 ){
        this.rayon = rayon;
        }
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public boolean contientPoint(Point point) {
        double distanceCarree = Math.pow(point.getX() - this.centre.getX(), 2) + Math.pow(point.getY() - this.centre.getY(), 2);
        return distanceCarree <= Math.pow(this.rayon, 2);
    }
}
