/**
 * Visiteur
 */
public class Visiteur extends Personne{

    public Visiteur(){
        super();
    }
    public Visiteur(String nom,String prenom,String num){
        super(nom,prenom,num);
    }

    public void choisirCage(Cage cage){
        System.out.println("Monsieur ou madame vous avez choisis"+this.getNom() + " " + super.getPrenom()+ 
        "\n vous avez choisis un la cage numero: "+cage.getNumero() +"situer sur l'adresse numero: "+ cage.getAdresse()
        );
    }
    public void Demanderreims(Agent agent,Cage cage){
        System.out.println("le nom de l'agent est "+agent.getNom()+ " "+ agent.getPrenom());
        for(Animal animal:cage.getAnimal() ){
            System.out.println(animal.toString());
        }
    }
}