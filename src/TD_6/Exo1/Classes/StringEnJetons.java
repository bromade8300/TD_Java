package TD_6.Exo1.Classes;

import java.util.ArrayList;
import java.util.List;

public class StringEnJetons {
    private String initialString;
    private int indexNextToken;
    private List<Jeton> tokensString = new ArrayList<>();

    public String getInitialString() {
        return initialString;
    }

    public List<Jeton> getTokensString() {
        return tokensString;
    }

    public StringEnJetons(String initialString) {
        this.initialString = initialString;
        this.indexNextToken = 0;
    }

    // avance tant qu'on est sur un espace
    private void avanceJusquAuProchainCaractereNonEspace() {
        while (indexNextToken < initialString.length() && initialString.charAt(indexNextToken) == ' ') {
            indexNextToken++;
        }
    }

    private void reinitialiser() {
        tokensString.clear();
        indexNextToken = 0;
        // on garde initialString (sinon NullPointerException)
    }

    private boolean isEnding() {
        return indexNextToken >= initialString.length();
    }

    private void prochainJeton() {
        avanceJusquAuProchainCaractereNonEspace();
        if (isEnding()) return;

        int indexStartJeton = indexNextToken;

        // avancer jusqu’à l’espace ou fin
        while (indexNextToken < initialString.length() && initialString.charAt(indexNextToken) != ' ') {
            indexNextToken++;
        }

        String jeton = initialString.substring(indexStartJeton, indexNextToken);
        tokensString.add(new Jeton(jeton));
    }

    public void tokenise() {
        reinitialiser();
        while (!isEnding()) {
            prochainJeton();
        }
    }
}
