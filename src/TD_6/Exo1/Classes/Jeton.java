package TD_6.Exo1.Classes;

public class Jeton {
private String contenu;
public Jeton(String contenu) {
    this.contenu = contenu;
}

public Jeton(char contenu) {
    this.contenu = String.valueOf(contenu);
}
public Jeton(){

}
public String getContenu() {
    return contenu;
}

public String toString() {
    return contenu;
}
public boolean equals (Jeton autreJeton){
    return autreJeton.getContenu().equals(this.contenu);
}


}
