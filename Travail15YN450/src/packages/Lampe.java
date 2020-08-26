package packages;

public class Lampe {
    public boolean etat;

    public Lampe() {
        this.etat = isEtat();
    }

    public Lampe(boolean etat){
        this.etat = etat;
    }

    public void allumer(){
        etat = true;
        System.out.println(" Lamp allumer ");
    }
    public void eteindre(){
        etat = false;
        System.out.println(" Lampp eteint  ");
    }
    public boolean isEtat() {
        return etat;
    }
    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
