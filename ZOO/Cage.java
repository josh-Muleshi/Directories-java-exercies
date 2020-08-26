import java.util.List;



/**
 * Cage
 */

public class Cage {

    private String adresse;
    private int numero;
    private List<Animal> animal;
    private Agent agent;
    
    public Cage(){
        this.adresse = "";
        this.numero = 0;
        this.animal = null;
        this.agent = null;
    }
    public Cage(String adresse,int numero,List<Animal> animal,Agent agent){
        this.adresse = adresse;
        this.numero = numero;
        this.animal = animal;
        this.agent = agent;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }


}