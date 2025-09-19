package TD_4.Exo_1.Exo_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.largeur = 1;
        rectangle.hauteur = 2;
        System.out.println(rectangle.estCarre());
        System.out.println(rectangle.calculPerimetre());
        System.out.println(rectangle.calculAire());
    }
}
