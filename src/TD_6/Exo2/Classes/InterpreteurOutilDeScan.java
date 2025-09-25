package TD_6.Exo2.Classes;

import TD_6.Exo1.Classes.Jeton;
import TD_6.Exo1.Classes.StringEnJetons;

public class InterpreteurOutilDeScan {
    private String nameToConvert;

    private Panier convertTokenInPanier(StringEnJetons stringEnJetons){
        Panier panier = new Panier();
        for(Jeton jeton : stringEnJetons.getTokensString()){
            Produit produit = new Produit();
            produit.name = jeton.getContenu();
            panier.addProduit(produit);
        }
        return panier;
    }

    public Panier interpreter(String listProduct){
        StringEnJetons stringEnJetons = new StringEnJetons(listProduct);
        stringEnJetons.tokenise();

        return  convertTokenInPanier(stringEnJetons);
    }


}
