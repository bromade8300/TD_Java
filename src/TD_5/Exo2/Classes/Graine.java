package TD_5.Exo2.Classes;

import static java.lang.Math.sqrt;

public class Graine {
    private int graine = 7;

    public boolean checkGraine(){

        if (this.graine <= 1) {
            return false;
        }

        for(int i=2;i<=sqrt(this.graine);i++){
            if(this.graine%i==0){
                return false;
            }
        }
        return true;
    }

    public Graine(int graine) {
        this.graine = graine;
    }

    public int getGraine() {
        return graine;
    }
}
