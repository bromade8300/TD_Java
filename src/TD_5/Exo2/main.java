package TD_5.Exo2;

import TD_5.Exo2.Classes.CompteBancaire;
import TD_5.Exo2.Classes.Graine;

public class main {
    public static void main(String[] args) {
        // création d'une graine
        Graine graine = new Graine(7);
        // création du compte
        CompteBancaire compteBancaire = new CompteBancaire("antoine",
                12365,
                "PWDSECURE",
                true,
                100,
                 graine
        );

        // retrait sans soucis
        compteBancaire.login("PWDSECURE");
        compteBancaire.retirer(10);
        compteBancaire.logout();

        // soulève une exception car le compte est vérouillé
        compteBancaire.retirer(10);

    }
}
