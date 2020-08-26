package banque;

import java.util.Date;

public class Versement extends Operation {

    public Versement() {
    }

    public Versement(int numero, double montant, Date dateOperation) {
        super(numero, montant, dateOperation);
    }
}
