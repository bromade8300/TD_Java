package TD_6.Exo2.Classes;

import java.util.List;

public class Panier {
    List<Produit> products;
    public void addProduit (Produit productToAdd){
        this.products.add(productToAdd);
    }
}
