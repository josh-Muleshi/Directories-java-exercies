package banque;

import java.util.Date;

public class Operation {

    private int numero;
    private double montant;
    private Date dateOperation;

    public Operation() {
        super();
    }

    public Operation(int numero, double montant, Date dateOperation) {
        this.numero = numero;
        this.montant = montant;
        this.dateOperation = dateOperation;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }
}
