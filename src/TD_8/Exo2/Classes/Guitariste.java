package TD_8.Exo2.Classes;

public class Guitariste extends Instrument{
    private int reste = 0;

    @Override
    public String sing(int timing, int duration) {
        if (reste > 0) {
            reste--;
            return "Bling-Bling";
        }
        if (rand.nextDouble() < 0.5) {
            reste = 1;
            return "Bling-Bling";
        }
        return this.getSilent();
    }
}
