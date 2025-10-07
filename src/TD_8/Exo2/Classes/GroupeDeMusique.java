package TD_8.Exo2.Classes;
public class GroupeDeMusique {
    private Partition partition;

    public GroupeDeMusique(int duree) {
        partition = new Partition(duree);
        partition.ajouterInstrument(new Chanteur());
        partition.ajouterInstrument(new Guitariste());
        partition.ajouterInstrument(new Trompettiste());
        partition.ajouterInstrument(new Maracas());
    }

    public void jouer() {
        partition.generer();
    }
}
