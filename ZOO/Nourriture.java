/**
 * Nourriture
 */
public class Nourriture {

    private Integer quantite;

    public Nourriture(){
        this.quantite = 0;
    }

    public Nourriture(int quantite ){
        this.quantite = quantite;
    }
    public int getQuantite(){
        return quantite;
    }
    public void setQuantite(int quantite){
        this.quantite = quantite;
    }
    public void diminuer(int quantite){
        this.quantite = quantite-1;
    }
    public int diminuer(){
        return this.getQuantite();
    }
    
}