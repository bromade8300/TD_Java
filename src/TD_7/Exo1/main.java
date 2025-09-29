package TD_7.Exo1;

import TD_7.Exo1.Classes.Disque;
import TD_7.Exo1.Classes.Oeuvre;
import TD_7.Exo1.Classes.Point;
import TD_7.affichage.Couleur;

public class main {

    public static void drawFace(int center, Couleur color, Oeuvre oeuvre){
        Point centreFace = new Point(center, center);
        Disque visage = new Disque(centreFace, 220, color);
        oeuvre.superposer(visage);
    }

    public static void drawEyes(int center, int decalageEyesX, int decalageEyesY, int rayonEyes, Couleur color, Oeuvre smiley){

        Point eyeCenterL = new Point(center - decalageEyesX, center - decalageEyesY); // (180, 200)
        Disque leftEye = new Disque(eyeCenterL, rayonEyes, color);
        smiley.superposer(leftEye);

        Point eyeCenterR = new Point(center + decalageEyesX, center - decalageEyesY); // (332, 200)
        Disque rightEye = new Disque(eyeCenterR, rayonEyes, color);
        smiley.superposer(rightEye);
    }

    public static void drawMouth(int rayonMouth,int center,Oeuvre smiley,Couleur color,Couleur faceColor){
        Point centerMouth = new Point(center, center + 50);
        Disque Mouth = new Disque(centerMouth, rayonMouth, color);
        smiley.superposer(Mouth);

        int rayonDecoupe = 100;
        Point centerMouthFill = new Point(center, center + 15);
        Disque cutting = new Disque(centerMouthFill, rayonDecoupe, faceColor);
        smiley.superposer(cutting);
    }
    public static void drawSmiley(){

        final int width = 512;
        final int center = width / 2; // 256

        Couleur black = new Couleur(0.0, 0.0, 0.0);
        Couleur yellow = new Couleur(1.0, 1.0, 0.0);
        Oeuvre smiley = new Oeuvre(width, width);

        int eyesRayon = 25;
        int eyesDecalageX = 76;
        int eyesDecalageY = 56;
        int rayonMouth = 100;

        drawFace(center, yellow,smiley);
        drawMouth(rayonMouth,center,smiley, black, yellow);
        drawEyes(center, eyesDecalageX, eyesDecalageY, eyesRayon, black,smiley);
        smiley.dessiner();
        smiley.run();
    }

    public static void main(String[] args) {
        drawSmiley();
    }
}
