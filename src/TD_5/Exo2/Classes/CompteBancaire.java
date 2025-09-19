package TD_5.Exo2.Classes;

public class CompteBancaire {
    private String proprietaire;
    public int numeroDeCompte;
    private boolean isLocked;
    private String hashMdp;
    private double argent;
    private Graine graine;

    private String hashMdp(String pwd){
        Hasheur hasheur = new Hasheur(this.graine);
        String hash = hasheur.hash(pwd);
        return hash;
    }

    public CompteBancaire(String proprietaire, int numeroDeCompte, String mdp, boolean isLocked, double argent, Graine graine) {
        this.proprietaire = proprietaire;
        this.numeroDeCompte = numeroDeCompte;
        this.graine = graine;
        this.hashMdp = hashMdp(mdp);
        this.isLocked = isLocked;
        this.argent = argent;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public int getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    private void verifierCompteNonVerrouille() {
        if (this.isLocked) {
            throw new IllegalStateException("Le compte est verrouillé. Veuillez vous connecter pour effectuer cette opération.");
        }
    }

    public void login(String mdp){
        Hasheur hasheur = new Hasheur(this.graine);
        if(hasheur.hash(mdp).equals(this.hashMdp)){
            this.isLocked = false;
            System.out.println("compte unlock");
        }
        else{
            throw new IllegalArgumentException("Mot de passe incorrect.");
        }
    }

    public void logout(){
        this.isLocked = true;
        System.out.println("compte lock");
    }

    private void tryRemoveMoney(float moneyToRemove){
        if(this.argent < moneyToRemove){
            throw new IllegalArgumentException("Fonds insuffisants");
        }else if(this.argent > moneyToRemove){
            this.argent -= argent;
            System.out.println("Somme retiré :" + argent);
        } else if(moneyToRemove<0){
            throw new IllegalArgumentException("Montant à retirer doit être > 0");
        }
    }

    public void retirer(float argent){
        verifierCompteNonVerrouille();
        tryRemoveMoney(argent);
    }

    public void deposer(float argent){
        verifierCompteNonVerrouille();
        if(argent<0){
            throw new IllegalArgumentException("Montant à déposer doit être > 0");
        }
        this.argent += argent;
        System.out.println("Somme déposé :" + argent);
    }

    public void afficherDetails(){
        verifierCompteNonVerrouille();
        System.out.println("Proprietaire: " + this.proprietaire);
        System.out.println("Numero de compte: " + this.numeroDeCompte);
        System.out.println("Solde: " + this.argent + " €");
    }
}
