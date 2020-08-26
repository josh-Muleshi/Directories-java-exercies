package Java.Exe01;

public class Voiture {

    private double vitesse;

    public Voiture(double vitesse) {
        this.vitesse = vitesse;
    }
    public double Acceler(){
        return this.vitesse = vitesse+1;
    }
    public double Desaccelr(){
       return this.vitesse = vitesse-1;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }
}
