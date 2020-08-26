package objet;

// Composition proie -> Estomac

class Proi{
    private  Estomac estomac;
    public Proi(){
        estomac = new Estomac();
    }
}
public class Estomac {
    public static void main(String[] args) {
        Proi p = new Proi();
    }
}