import javax.print.DocFlavor.STRING;

class Identitepers{
    private String nom;
    private String prenom;
    private char genre;
    private  byte age; 
    private String adresse;

    public Identitepers(){
        nom = "";
        prenom ="";
        genre =' ';
        age = 0;
        adresse ="";
        
    }
    public void Identitepers(String _nom,String _prenom,char _genre,byte _age,String _adresse){
            nom =_nom;
            prenom=_prenom;
            genre =_genre;
            age =_age;
            adresse =_adresse;

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
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void Afficheridentitie(){
        System.out.println ("nom: "+nom + "\n prenom: "+prenom +"\n genre: "+genre +"\n age: "+age +"\n adresse: "+adresse);

    }
}

