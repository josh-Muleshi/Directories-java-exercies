/**
 * Identite_Personne
 */
public class Identite_Personne {
    
    private String nom;
    private String prenom;
    private char genre;
    private byte age;
    private String Adresse;
    public Identite_Personne() {
        this.nom = "kabisa";
        this.prenom = "Mwambuyi";
        this.genre = 'F';
        this.age = 21;
        this.Adresse = "Commune Katuba  Avenu mpala n* 31";
    
    } 
    
    
    public Identite_Personne(String nom, String prenom, char genre, byte age, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.age = age;
        this.Adresse = adresse;
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

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }
    public void AfficherIdentite(){
        System.out.println("############################# IDENTITE DE LA PERSONNE #############################");
        System.out.println(
            " nom: "+this.getNom() +
            "\n prenom : "+this.getPrenom() +
            "\n genre : "+this.getGenre() +
            "\n age : "+this.getAge() +
            "\n adresse: "+this.getAdresse()
        );                        
    }

   
    
}