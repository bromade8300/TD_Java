package TD_4.Exo_2.Classes;

public class Test {
    public String attribut ;
    public int difficulte;

    public boolean passe(De de){
        int result = de.jette();
        return result >= difficulte;
    }
}
