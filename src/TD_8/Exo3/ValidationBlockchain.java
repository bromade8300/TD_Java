package TD_8.Exo3;


import TD_8.Exo3.BlockChain.Bloc;
import TD_8.Exo3.BlockChain.Blockchain;
import TD_8.Exo3.Cryptographie.Corruptible;
import TD_8.Exo3.Finance.Transaction;

import java.util.HashMap;

public class ValidationBlockchain {
	
	private static void afficherBlockchain (Blockchain blockchain) {
		
		System.out.println ("Blockchain de taille " + blockchain.getTaille () + " :");
		
		for (int i = 0; i < blockchain.getTaille (); i++) {
			
			Bloc blocEnCours = blockchain.getBloc (i);
			
			System.out.println ("\tBloc " + (i + 1) + ":");
			System.out.println ("\t\tHash = " + blocEnCours.hashCode());
			System.out.println ("\t\tHash du bloc précédent = " + blocEnCours.getHashDuBlocPrecedent ());
			System.out.println ("\t\tCorrompu = " + blocEnCours.estCorrompu ());
			System.out.println ("\t\tContenu :");
			
			for (int j = 0; j < blocEnCours.getTaille (); j++)
				System.out.println ("\t\t\t" + blocEnCours.getDonnee (j));
		}
		
	}
	
	private static void afficherSoldes (Blockchain blockchain) {
		
		HashMap<String, Double> soldes = new HashMap<String, Double> ();
		
		for (int i = 0; i < blockchain.getTaille (); i++) {
			
			Bloc blocEnCours = blockchain.getBloc (i);
			
			for (int j = 0; j < blocEnCours.getTaille (); j++) {
				
				Corruptible corruptibleEnCours = blocEnCours.getDonnee (j);
				
				if (!(corruptibleEnCours instanceof Transaction))
					continue;
					
				Transaction transactionEnCours = (Transaction)corruptibleEnCours;
				
				String payeur = transactionEnCours.getPayeur();
				String receveur = transactionEnCours.getReceveur();
				double quantite = transactionEnCours.getQuantite();

				if (soldes.containsKey (payeur))
					soldes.replace (payeur, soldes.get (payeur) - quantite);
				else
					soldes.put (payeur, -quantite);

				if (soldes.containsKey (receveur))
					soldes.replace (receveur, soldes.get (receveur) + quantite);
				else
					soldes.put (receveur, quantite);
				
			}
			
		}
		
		System.out.println ("Soldes :");
		
		for (String utilisateur : soldes.keySet ())
			System.out.println(" - " + utilisateur + " : " + soldes.get (utilisateur));
		
	}
	
	public static void main (String[] args) {
		
		Blockchain blockchain = new Blockchain ();
		
		Bloc premierBloc = new Bloc ();
		
		Transaction aliceVersBob12 = new Transaction ("Alice", "Bob", 12.0);
		aliceVersBob12.signer ();
		premierBloc.ajouterCorruptible (aliceVersBob12);
		
		Transaction aliceVersCharlie8 = new Transaction ("Alice", "Charlie", 8.0);
		aliceVersCharlie8.signer ();
		premierBloc.ajouterCorruptible (aliceVersCharlie8);
		
		premierBloc.signer ();
		blockchain.ajouterBloc (premierBloc);
		
		Bloc secondBloc = new Bloc (premierBloc.hashCode ());
		
		Transaction bobVersCharlie9 = new Transaction ("Bob", "Charlie", 9.0);
		bobVersCharlie9.signer ();
		secondBloc.ajouterCorruptible (bobVersCharlie9);
		
		Transaction charlieVersAlice3 = new Transaction ("Charlie", "Alice", 3.0);
		charlieVersAlice3.signer ();
		secondBloc.ajouterCorruptible (charlieVersAlice3);
		
		secondBloc.signer ();
		blockchain.ajouterBloc (secondBloc);
		
		afficherBlockchain (blockchain);
		
		if (blockchain.estCorrompu ())
			System.out.println ("\nCette blockchain est CORROMPUE!\n");
		else
			System.out.println ("\nCette blockchain n'est pas corrompue.\n");
		
		System.out.println ("====> On change la transaction d'Alice vers Charlie de 8 à 4\n");
		aliceVersCharlie8.setQuantite (4.0);
		
		afficherBlockchain (blockchain);
		
		if (blockchain.estCorrompu ())
			System.out.println ("\nCette blockchain est CORROMPUE!\n");
		else
			System.out.println ("\nCette blockchain n'est pas corrompue.\n");
		
		System.out.println ("");
		
		afficherSoldes (blockchain);
		
	}

}
