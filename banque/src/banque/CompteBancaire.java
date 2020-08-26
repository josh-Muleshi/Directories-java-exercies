package banque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class CompteBancaire {

    protected int code;
    protected double solde;
    protected List<Operation> operations = new ArrayList<>();

    public CompteBancaire() {
        super();
    }

    public CompteBancaire(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public CompteBancaire(int code, double solde, List<Operation> operations) {
        super();
        this.code = code;
        this.solde = solde;
        this.operations = operations;
    }


    public void deposer(double montant) {
        Versement versement = new Versement(operations.size() + 1, montant, new Date());
        operations.add(versement);
        solde += montant;
    }

    public abstract void retirer(double montant);

    public void virement(double montant, CompteBancaire compteBancaire) {
        retirer(montant);
        compteBancaire.deposer(montant);
    }

    public double consulterSolde() {
        return solde;
    }

    public abstract void updateSolde();

    public List<Operation> getOperations() {
        return operations;
    }

    public double totalVersement() {
        double somme = 0;
        for (Operation operation : operations) {
            if(operation instanceof Retrait)
                somme = somme + operation.getMontant();
        }
        return somme;
    }



}
