package TD_5.Exo1;

import TD_5.Exo1.Classes.Cercle;
import TD_5.Exo1.Classes.Point;

import java.util.Random;

public class main {

    public static double monteCarlo(int nbPoints,Point centreCercle,double rayonCercle) {
        int pointsDansCercle = 0;
        Random rand = new Random();

        Cercle cercle = new Cercle(centreCercle,rayonCercle);
        for (int i = 0; i < nbPoints; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            Point pointAleatoire = new Point(x, y);

            if (cercle.contientPoint(pointAleatoire)) {
                pointsDansCercle++;
            }
        }
        return 4.0 * pointsDansCercle / nbPoints;
    }

    public static void main(String[] args) {
        Point point = new Point(0.5,0.5);
         double estimatedPi = monteCarlo(150,point,0.5);
         System.out.println(estimatedPi);
    }
}
