package TD_8.Exo2.Classes;

import java.util.List;
import java.util.Random;

public abstract class Instrument {
    protected Random rand = new Random();
    private String silent = "_";
    public abstract String sing(int timing, int duration);

    public String getSilent() {
        return silent;
    }
}
