package Uml;

public class Animal {

    private String nom;
    private String famille;
    public Nourriture nourriture;

    public Animal(String nom, String famille) {
        this.nom = nom;
        this.famille = famille;
    }

    public Animal() {
        this.nom  = getNom();
        this.famille = getFamille();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public void manger(){
        System.out.printf("manger votre repas %s", nourriture.getQuantite());
    }

}
