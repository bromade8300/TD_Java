package TD_8.Exo1.Classes;

import TD_8.affichage.Couleur;

public class FondDegrade extends Fond{
    private Couleur couleurTop;
    private Couleur couleurBottom;

    public FondDegrade(Couleur couleurTop, Couleur couleurBottom,Resolution resolution) {
        super(resolution);
        this.couleurTop = couleurTop;
        this.couleurBottom = couleurBottom;
    }

    @Override
    public Couleur evaluer(Point point) {
        double r = (double) point.getY() / (double) this.getResolution().getHeight();

        double red   = couleurTop.getRouge()   * (1 - r) + couleurBottom.getRouge()*r;
        double green = couleurTop.getVert() * (1 - r) + couleurBottom.getBleu() * r;
        double blue  = couleurTop.getBleu()  * (1 - r) + couleurBottom.getBleu()  * r;
        return new Couleur(red, green, blue);
    }
}
