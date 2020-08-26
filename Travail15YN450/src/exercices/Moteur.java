package exercices;

public class Moteur {
    String typeCarburant;

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }
    public Moteur(){
        this.typeCarburant = "essence";
    }
    public Moteur(String typeCarburant){
        this.typeCarburant = typeCarburant;
    }
}
