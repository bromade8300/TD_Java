package TD_8.Exo2.Classes;

public class Trompettiste extends Instrument{
    private int souffle = 0;

    @Override
    public String sing(int timing, int duration) {
        if (souffle > 0) {
            souffle--;
            return "Poueeeeeeet";
        }
        if (rand.nextDouble() < 0.4) {
            souffle = rand.nextInt(3) + 2; // souffle entre 2 et 4 temps
            return "Poueeeeeeet";
        }
        return this.getSilent();
    }
}
