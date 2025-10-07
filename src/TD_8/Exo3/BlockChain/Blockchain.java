package TD_8.Exo3.BlockChain;


import TD_8.Exo3.Cryptographie.Corruptible;

import java.util.ArrayList;
import java.util.List;

public class Blockchain extends Corruptible {

    private List<Bloc> chaine;

    public Blockchain() {
        this.chaine = new ArrayList<>();
        Bloc blocOrigine = new Bloc();
        blocOrigine.signer();
        this.chaine.add(blocOrigine);
    }
    @Override
    public boolean estCorrompu() {
        for (int i = 1; i < this.chaine.size(); i++) {
            Bloc blocCourant = this.chaine.get(i);

            if(blocCourant.estCorrompu()){
                return true;
            }

            if(i==0){
                if(blocCourant.getHashDuBlocPrecedent() != 0){
                    return true;
                }
            } else{
                Bloc blocPrecedent = this.chaine.get(i - 1);
                if(blocCourant.getHashDuBlocPrecedent() != blocPrecedent.hashCode()){
                    return true;
                }
            }
        }
        return false;
    }

//    public void ajouterBloc(Bloc nouveauBloc) {
//        if (this.estCorrompu()) {
//            throw new IllegalArgumentException("La blockchain est corrompue. Impossible d'ajouter de nouveaux blocs.");
//        }
//        this.chaine.add(nouveauBloc);
//    }

    public void ajouterBloc(Bloc bloc) {
        if (bloc == null) {
            throw new IllegalArgumentException("Bloc nul interdit.");
        }

        try {
            if (bloc.estCorrompu()) {
                throw new IllegalArgumentException("Bloc corrompu : ajout interdit.");
            }
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Bloc non signé : ajout impossible.", e);
        }

        if (chaine.isEmpty()) {
            if (bloc.getHashDuBlocPrecedent() != 0) {
                throw new IllegalArgumentException("Premier bloc invalide : hash précédent doit être 0.");
            }
            chaine.add(bloc);
        }
    }

    public Bloc getBloc(int index) {
        if (index < 0 || index >= this.chaine.size()) {
            throw new IndexOutOfBoundsException("L'index " + index + " est hors des limites de la blockchain [0, " + (this.chaine.size() - 1) + "].");
        }
        return this.chaine.get(index);
    }

    public int getTaille() {
        return this.chaine.size();
    }
}
