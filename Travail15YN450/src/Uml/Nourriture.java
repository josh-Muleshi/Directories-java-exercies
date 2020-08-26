package Uml;

public class Nourriture {

    private int quantite;

    public Nourriture(int quantite) {
        this.quantite = quantite;
    }

    public void diminuer(){
        quantite-=1;
        System.out.println("la quantite de nourriture diminue" + quantite);
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
