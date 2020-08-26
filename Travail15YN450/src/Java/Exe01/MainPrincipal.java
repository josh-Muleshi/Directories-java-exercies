package Java.Exe01;

public class MainPrincipal {
    public static void main(String[] args) {
        Voiture nVoiture = new Voiture(20);
        System.out.println("Vitesse Acceleree   => " + nVoiture.Acceler());
        System.out.println("Vitesse Desacceler  => " + nVoiture.Desaccelr());
    }
}
