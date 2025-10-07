package TD_8.Exo1.Classes;

import TD_8.affichage.Couleur;

import java.awt.*;

public  abstract class Fond extends ElementGraphique {
    private Resolution resolution;

    public Resolution getResolution() {
        return resolution;
    }

    public Fond(Resolution resolution) {
        super();
        this.resolution = resolution;
    }
}
