package exercices;

public class TestPrincipal {
    public static void main(String[] args) {
        Voiture BMW = new Voiture(" BMW "," SUZUKI ");
        System.out.println("La marque de la Voiture est : " + BMW.getMarque());
        for (int i=0; i<4; i++){
            System.out.println(" le Pneu n: "+ i + " est de marque: " + BMW.pneu[i].getMarque());
        }
    }
}
