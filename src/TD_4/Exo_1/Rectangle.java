package TD_4.Exo_1;

public class Rectangle {
    public int largeur;
    public int hauteur;

    public double calculAire(){
        return this.largeur*this.hauteur;
    }

    public double calculPerimetre(){
        return (this.largeur+this.largeur)*2;
    }

    public boolean estCarre(){
        return largeur == hauteur;
    }
}

