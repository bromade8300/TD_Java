package TD_6.Exo1;

import TD_6.Exo1.Classes.Jeton;
import TD_6.Exo1.Classes.StringEnJetons;

import java.util.Scanner;

public class Main {

    public static void displayStringInTokens(Scanner scanner){
        System.out.print("Enter String: ");
        String stringToTokenise = scanner.nextLine();

        StringEnJetons stringEnJetons = new StringEnJetons(stringToTokenise);
        stringEnJetons.tokenise();

        for(Jeton jeton : stringEnJetons.getTokensString()){
            System.out.println(jeton.toString());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        displayStringInTokens(scanner);
        displayStringInTokens(scanner);
        scanner.close();
    }
}
