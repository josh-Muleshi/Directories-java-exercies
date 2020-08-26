import java.util.List;

/**
 * Zoo
 */
public class Zoo {

    private String nom;
    private List<Cage> cage;
    private String adresse;
    
    public Zoo(){
        this.nom = "";
        this.cage = null;
        this.adresse = null;
    }
    public Zoo(String nom,List<Cage> c,String adresse){
        this.nom = nom;
        this.cage = c;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Cage> getCage() {
        return cage;
    }

    public void setCage(List<Cage> cage) {
        this.cage = cage;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}