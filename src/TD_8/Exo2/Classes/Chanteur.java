package TD_8.Exo2.Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Chanteur  extends Instrument {
    private List<String> mots = new ArrayList<>(Arrays.asList("love", "sun", "feeling", "hot-dog"));

    @Override
    public String sing(int timing, int duration) {

        if (rand.nextDouble() < 0.3) {
            return mots.get(rand.nextInt(mots.size()));
        }
        return this.getSilent();

    }
}
