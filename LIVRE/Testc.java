/**
 * Testc
 */
public class Testc {

    public static void main(String[] args) {
        Livrec livre = new Livrec();
        livre.Afficher();
        livre.Ouvrir(3);
        livre.setNomLivre("poo");
        livre.setNomAuteur("boneige");
        livre.setMaisonEdition("mediaspaul");
        livre.setDateEdition("2020");
        livre.setNombre(416);
        livre.Afficher();

    }
}