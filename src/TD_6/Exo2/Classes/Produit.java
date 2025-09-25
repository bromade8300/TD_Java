package TD_6.Exo2.Classes;

import java.util.Scanner;

public class Produit {
    String name;

    public void setName(String name) {
        this.name = name;
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
