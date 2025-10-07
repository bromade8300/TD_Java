package TD_8.Exo3;

import TD_8.Exo3.Finance.Transaction;

public class ValidationTransaction {
	
	public static void main(String[] args) {
		
		Transaction premiereTransaction = new Transaction("Alice", "Bob", 12.0);
		System.out.println("Le hash de la transaction \"" + premiereTransaction + "\" est " + premiereTransaction.hashCode());
		
		Transaction deuxiemeTransaction = new Transaction("Alice", "Bob", 12.000000001);
		System.out.println("Le hash de la transaction \"" + deuxiemeTransaction + "\" est " + deuxiemeTransaction.hashCode());
		
		System.out.println ("On signe la première transaction");
		premiereTransaction.signer();
		
		if (premiereTransaction.estCorrompu())
			System.out.println ("\nCette transaction est CORROMPUE!\n");
		else
			System.out.println ("\nCette transaction n'est pas corrompue.\n");

		System.out.println ("Bob change la transaction pour indiquer qu'Alice lui a versé 1000");
		premiereTransaction.setQuantite(1000);
		
		if (premiereTransaction.estCorrompu())
			System.out.println ("\nCette transaction est CORROMPUE!\n");
		else
			System.out.println ("\nCette transaction n'est pas corrompue.\n");
		
	}

}
