package packages;

public class Interrupteur {

    private Lampe lampe;

    public Interrupteur(Lampe lampe) {
        this.lampe = getLampe();
    }

    public void puttOn(){
        System.out.println(" Interrupteur PuttOn(allumer) ");
    }
    public void puttOff(){
        System.out.println(" Interrupteur PuttOff(eteindre) ");
    }

    public Lampe getLampe() {
        return lampe;
    }

    public void setLampe(Lampe lampe) {
        this.lampe = lampe;
    }
}
