package TD_8.Exo2.Classes;

import java.util.ArrayList;
import java.util.List;

public class Partition {
    private int duree;
    private List<Instrument> instruments = new ArrayList<>();

    public Partition(int duree) {
        this.duree = duree;
    }

    public void ajouterInstrument(Instrument i) {
        instruments.add(i);
    }

    public void generer() {
        for (Instrument i : instruments) {
            for (int t = 0; t < duree; t++) {
                System.out.print(i.sing(t, duree) + "\t");
            }
            System.out.println();
        }
    }
}
