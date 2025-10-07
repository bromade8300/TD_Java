package TD_8.Exo3.Cryptographie;

public abstract class ObjetSigne extends Corruptible {
    private int signature;
    public int getSignature() {
        return signature;
    }
    public void signer (){
        if(signature!=0){
            throw new IllegalStateException("object already signed");
        }
        signature = hashCode();
    }

    @Override
    public boolean estCorrompu(){

        if(signature==0){
            throw new IllegalStateException("object was not signed");
        }
        return hashCode() != signature;
    }
}
