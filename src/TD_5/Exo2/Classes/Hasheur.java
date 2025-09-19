package TD_5.Exo2.Classes;

public class Hasheur {
    private Graine graine;

    public Hasheur(Graine graine) {
        this.graine = graine;
    }

    public String hash(String objet){
        int hash = 0;
        if(graine.checkGraine()){
            for(int i = 0; i < objet.length(); i++){
                hash = hash*graine.getGraine() +  objet.charAt(i);
            }
        }
        return String.valueOf(hash);
    }
}
