package objet;

// Association Proie -> Eau

public class Proie {

    private Eau e;
    Proie(Eau eau){
        e = eau;
    }
    void bois(){
        e.diminue();
    }

    public Eau getE() {
        return e;
    }

    public void setE(Eau e) {
        this.e = e;
    }
}
class Eau {
    void diminue(){ System.out.println("Eau diminue");}
    public static void main(String[] args){
        Eau eau = new Eau();
        Proie proie = new Proie(eau);
        proie.bois();
    }
}


