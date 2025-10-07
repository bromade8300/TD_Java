package TD_8.Exo2.Classes;

public class Maracas extends Instrument {
    @Override
    public String sing(int temps, int duree) {
        return (temps % 2 == 0) ? "sh-k" : "sh-k";
    }
}
