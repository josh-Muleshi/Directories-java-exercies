package exercices;

public class Voiture {
    private String marque;
    Pneu pneu[] = new Pneu[4];
    Voiture(){
        marque = "voiture par default";
        for (int i = 0; i<4; i++){
            pneu[i] = new Pneu();
        }
    }
    Voiture(String marque, String marquePneu){
        this.marque = marque;
        for (int i=0; i<4; i++){
            pneu[i] = new Pneu(marquePneu);
        }
    }

    public String getMarque() {
        return marque;
    }
}
