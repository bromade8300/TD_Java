package TD_4.Exo_2;

import TD_4.Exo_2.Classes.De;
import TD_4.Exo_2.Classes.Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.difficulte = 123;

        De de = new De();
        de.nombreDeFaces = 20;

        boolean result = test.passe(de);
        if(result){
            System.out.println("GG");
        } else {
            System.out.println("rip");
        }

    }
}

