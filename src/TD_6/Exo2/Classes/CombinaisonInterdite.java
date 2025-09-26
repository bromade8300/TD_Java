package TD_6.Exo2.Classes;

import java.util.List;

public class CombinaisonInterdite {
    private List<Produit> products;

    public CombinaisonInterdite(List<Produit> products) {
        this.products = products;
    }

    public boolean detecte(List<Produit> productsToVerify){
        return productsToVerify.equals(this.products);
    }
}
