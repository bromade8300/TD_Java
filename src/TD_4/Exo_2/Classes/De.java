package TD_4.Exo_2.Classes;

import java.util.Random;

public class De {
    public int nombreDeFaces;

    public int jette(){
        Random random = new Random();
        return random.nextInt(20)+1;
    }
}
