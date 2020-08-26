/**
 * Agent
 */
public class Agent extends Personne {

    private String numero;
    
    public Agent(){
        super();
        this.numero = " ";
    }
    public Agent(String nom, String prenom,String numerot,String numeroM){
        super(nom,prenom,numerot);
        this.numero = numeroM;
    }
    public Agent(String numero){
        this.numero = numero;
    }
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}