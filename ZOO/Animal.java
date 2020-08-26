public class Animal{
    private String nom;
    private String famille;
    
    
    public Animal(){
        this.nom ="null";
        this.famille="";
    }
    public Animal(String nom,String famille){
        this.nom = nom;
        this.famille = famille;
    }
    public String getNom(){
        return this.nom;
    }
    public String getFamille(){
        return this.famille;
    }
    public void setFamille(String famille){
        this.famille = famille;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void Manger(Nourriture N){
        N.diminuer();
    }

    @Override
    public String toString() {
        return "Animal [famille=" + famille + ", nom=" + nom + "]";
    }
    

}