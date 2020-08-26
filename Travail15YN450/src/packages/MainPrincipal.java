package packages;

public class MainPrincipal {
    public static void main(String[] args) {
        Lampe lampe = new Lampe();
        Interrupteur interrupteur = new Interrupteur(lampe);
        interrupteur.puttOn();
        interrupteur.puttOff();
        lampe.allumer();
        lampe.eteindre();
    }
}
