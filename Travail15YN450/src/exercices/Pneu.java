package exercices;

public class Pneu {
    String marque;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    public Pneu(){
        this.marque = "default";
    }
    public Pneu(String marque){
        this.marque = marque;
    }
}
