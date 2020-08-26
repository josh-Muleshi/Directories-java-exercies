package banque;

import java.util.Date;
import java.util.List;

public class ComptePayant extends CompteBancaire {

    private double decouvert;

    @Override
    public void retirer(double montant) {
        if(montant > solde + decouvert) {
            throw new RuntimeException("Solde Insuffisant.");
        } else {
            Retrait retrait = new Retrait(operations.size() + 1, montant, new Date());
            operations.add(retrait);
            solde -= montant;
        }
    }

    @Override
    public void updateSolde() {

    }


    public ComptePayant() {
        super();
    }

    public ComptePayant(int code, double solde) {
        super(code, solde);
    }

    public ComptePayant(int code, double solde, double decouvert) {
        super(code, solde);
        this.decouvert = decouvert;
    }
}
