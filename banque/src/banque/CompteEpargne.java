package banque;

import java.util.Date;
import java.util.List;

public class CompteEpargne extends CompteBancaire {

    private double taux;

    @Override
    public void retirer(double montant) {
        if(montant > solde) {
            throw  new RuntimeException("Solde insuffisant.");
        } else {
            Retrait retrait = new Retrait(operations.size() + 1, montant, new Date());
            operations.add(retrait);
            solde -= montant;
        }
    }

    @Override
    public void updateSolde() {
        solde = solde + (solde * taux / 100);
    }

    public CompteEpargne() {
        super();
    }

    public CompteEpargne(int code, double solde) {
        super(code, solde);
    }

    public CompteEpargne(int code, double solde, double taux) {
        super(code, solde);
        this.taux = taux;
    }
}
