package TD_4.Exo_3.Classes;

public class Magicien {
    Papier papier;

    public void JoueLeTour(int step){
        switch (step){
            case 0:
        System.out.println("Debute le tour, écris ton age");
        break;
        case 1:
            System.out.println(papier.ageSpectateur);
            break;
        }
    }


}
