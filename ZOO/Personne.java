/**
 * Personne
 */
public class Personne {

    private String nom;
    private String prenom;
    private String tel;

    public Personne(){
        this.nom = "inconnue";
        this.prenom = "inconnue";
        this.tel = "inconnue";
    }
    public Personne(String nom, String prenom,String tel){
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}