package banque;

import java.util.Date;

public class Retrait extends Operation {

    public Retrait() {
    }

    public Retrait(int numero, double montant, Date dateOperation) {
        super(numero, montant, dateOperation);
    }
}
