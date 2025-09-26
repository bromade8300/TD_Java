package TD_6.Exo2.Classes;

import java.util.Scanner;

public class Produit {
    private String name;

    public Produit(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public boolean isEquals(Produit productToCompare){
        return this.name.equals(productToCompare.name);
    }


}
