package TD_8.Exo3.BlockChain;

import TD_8.Exo3.Cryptographie.Corruptible;
import TD_8.Exo3.Cryptographie.ObjetSigne;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bloc extends ObjetSigne {
    private int hashDuBlocPrecedent;
    List<Corruptible> contenu;

    public Bloc() {
        this.contenu = new ArrayList<>();
    }

    public int getHashDuBlocPrecedent(){
        return this.hashDuBlocPrecedent;
    }

    public int getTaille(){
        return this.contenu.size();
    }

    public Corruptible getDonnee(int index){
        return this.contenu.get(index);
    }

    public Bloc(int hashDuBlocPrecedent) {
        super();
        if (hashDuBlocPrecedent==0) {
            throw new IllegalArgumentException("Le hash du bloc précédent ne peut pas être vide pour un bloc successeur.");
        }
        this.hashDuBlocPrecedent = hashDuBlocPrecedent;
        this.contenu = new ArrayList<>();
    }

    public void ajouterCorruptible(Corruptible corruptible) {
        this.contenu.add(corruptible);
    }

    public Corruptible getObjet(int index) {
        // lance tout seul l'exception out of bound
        return this.contenu.get(index);
    }


    public void setHashDuBlocPrecedent(int hash) {
        this.hashDuBlocPrecedent = hash;
    }

    @Override
    public int hashCode(){
        return Objects.hash(hashDuBlocPrecedent, contenu);
    }
}
