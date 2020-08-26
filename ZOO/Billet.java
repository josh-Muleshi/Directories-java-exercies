/**
 * Billet
 */
public class Billet {

    private float prix;
    private Visiteur visiteur;

    public Billet(float prix, Visiteur visiteur) {
        this.prix = prix;
        this.visiteur = visiteur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }
    
    
}