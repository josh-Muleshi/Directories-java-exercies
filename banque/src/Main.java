import banque.CompteBancaire;
import banque.ComptePayant;
import banque.CompteEpargne;

public class Main {
    public static void main(String ... args) {

        CompteBancaire compte1 = new ComptePayant(1, 0);
        CompteBancaire compte2 = new CompteEpargne(2, 0, 1.9);

        compte1.deposer(100000);
        compte2.deposer(50000);

        compte1.retirer(45000);
        compte2.retirer(300);

        System.out.println("Solde compte 1 : " + compte1.consulterSolde());
        System.out.println("Solde compte 2 : " + compte2.consulterSolde());
    }
}
