package TD_6.Exo2;

import TD_6.Exo1.Classes.StringEnJetons;
import TD_6.Exo2.Classes.InterpreteurOutilDeScan;
import TD_6.Exo2.Classes.Panier;
import TD_6.Exo2.Classes.Produit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Produit produit = new Produit("test");

        Panier wrongProducts=new Panier();
        wrongProducts.addProduit(produit);
        wrongProducts.addProduit(produit);
        String listProducts = scanner.nextLine();
        InterpreteurOutilDeScan scan=new InterpreteurOutilDeScan();
        Panier panier = scan.interpreter(listProducts);




    }
}
