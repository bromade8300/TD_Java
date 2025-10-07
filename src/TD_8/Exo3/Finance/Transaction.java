package TD_8.Exo3.Finance;

import TD_8.Exo3.Cryptographie.ObjetSigne;

import java.util.Objects;

public class Transaction extends ObjetSigne {
    private String payeur;
    private double quantite;
    private String receveur;
    @Override
    public String toString() {
        return payeur + " -> " + receveur + " : " + quantite;
    }

    public Transaction(String receveur, String payeur, double quantite) {
        this.receveur = receveur;
        this.payeur = payeur;
        this.quantite = quantite;
    }

    public String getPayeur() {
        return this.payeur;
    }

    public double getQuantite() {
        return this.quantite;
    }

    public String getReceveur(){
        return this.receveur;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.payeur, this.quantite, this.receveur);
    }

}
