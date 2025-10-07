package TD_8.affichage;

public class Couleur {
	
	private double rouge;
	private double vert;
	private double bleu;
	
	public Couleur (double rouge, double vert, double bleu) {
		
		this.rouge = rouge;
		this.vert = vert;
		this.bleu = bleu;
		
	}
	
	public Couleur () {
		
		this (0, 0, 0);
		
	}
	
	public double getRouge () {
		
		return this.rouge;
		
	}
	
	public void setRouge (double rouge) {
		
		this.rouge = rouge;
		
	}
	
	public double getVert () {
		
		return this.vert;
		
	}
	
	public void setVert (double vert) {
		
		this.vert = vert;
		
	}
	
	public double getBleu () {
		
		return this.bleu;
		
	}
	
	public void setBleu (double bleu) {
		
		this.bleu = bleu;
		
	}
	
	public void ajoute (Couleur otherCouleur) {
		
		this.rouge += otherCouleur.rouge;
		this.vert += otherCouleur.vert;
		this.bleu += otherCouleur.bleu;
		
	}
	
	public static Couleur ajoute (Couleur Couleur1, Couleur Couleur2) {
		
		return new Couleur (Couleur1.rouge + Couleur2.rouge, Couleur1.vert + Couleur2.vert, Couleur1.bleu + Couleur2.bleu);
		
	}
	
	public void multipliePar (Couleur otherCouleur) {
		
		this.rouge *= otherCouleur.rouge;
		this.vert *= otherCouleur.vert;
		this.bleu *= otherCouleur.bleu;
		
	}
	
	public static Couleur multiplie (Couleur Couleur1, Couleur Couleur2) {
		
		return new Couleur (Couleur1.rouge * Couleur2.rouge, Couleur1.vert * Couleur2.vert, Couleur1.bleu * Couleur2.bleu);
		
	}
	
	public void multipliePar (double valeur) {
		
		this.rouge *= valeur;
		this.vert *= valeur;
		this.bleu *= valeur;
		
	}
	
	public static Couleur multiplie (Couleur Couleur, double valeur) {

		return new Couleur (Couleur.rouge * valeur, Couleur.vert * valeur, Couleur.bleu * valeur);
		
	}

}
