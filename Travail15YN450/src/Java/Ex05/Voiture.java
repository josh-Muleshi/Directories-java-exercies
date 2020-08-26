package Java.Ex05;

public class Voiture {
    public double vitesse;
    public int nombrePassager;
    public double vitessMax;
    public double nombreVitesse;
    public double capaciteReservoir;
    public int age;
    public int prix;
    public String couleur;
    public int nombrePortiere;

    public Voiture(double vitesse, int nombrePassager, double vitessMax, double nombreVitesse, double capaciteReservoir, int age, int prix, String couleur, int nombrePortiere) {
        this.vitesse = vitesse;
        this.nombrePassager = nombrePassager;
        this.vitessMax = vitessMax;
        this.nombreVitesse = nombreVitesse;
        this.capaciteReservoir = capaciteReservoir;
        this.age = age;
        this.prix = prix;
        this.couleur = couleur;
        this.nombrePortiere = nombrePortiere;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public int getNombrePassager() {
        return nombrePassager;
    }

    public void setNombrePassager(int nombrePassager) {
        this.nombrePassager = nombrePassager;
    }

    public double getVitessMax() {
        return vitessMax;
    }

    public void setVitessMax(double vitessMax) {
        this.vitessMax = vitessMax;
    }

    public double getNombreVitesse() {
        return nombreVitesse;
    }

    public void setNombreVitesse(double nombreVitesse) {
        this.nombreVitesse = nombreVitesse;
    }

    public double getCapaciteReservoir() {
        return capaciteReservoir;
    }

    public void setCapaciteReservoir(double capaciteReservoir) {
        this.capaciteReservoir = capaciteReservoir;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNombrePortiere() {
        return nombrePortiere;
    }

    public void setNombrePortiere(int nombrePortiere) {
        this.nombrePortiere = nombrePortiere;
    }
}
