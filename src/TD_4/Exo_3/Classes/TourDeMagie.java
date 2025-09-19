package TD_4.Exo_3.Classes;

public class TourDeMagie {
    public int step;
    Magicien magicien;
    Spectateur spectateur;
    Papier papier;
    Assistant assistant;

    public void debuteLeTour(Magicien magicien, Papier papier,Spectateur spectateur,Assistant assistant){
        step = 0;
        this.magicien = magicien;
        this.spectateur = spectateur;
        this.papier = papier;
        this.assistant = assistant;

        magicien.JoueLeTour(step);
        spectateur.ecrireAge(papier);
        step++;
        assistant.Calcul(spectateur.age);
        magicien.JoueLeTour(step);
    }
}
