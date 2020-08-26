/** 
 * Livre
 */
public class Livrec {

    private String nomLivre;
    private String nomAuteur;
    private String maisonEdition;
    private String dateEdition;
    private int nombre;

    public Livrec(){
        this.nomLivre = "null";
        this.nomAuteur = "null";
        this.maisonEdition = "null";
        this.dateEdition = "null";
        this.nombre = 0;
    }
    public Livrec(String nomL,String nomA,String maison,String date,int num){
        this.nomLivre = nomL;
        this.nomAuteur = nomA;
        this.maisonEdition = maison;
        this.dateEdition = date;
        this.nombre = num;
    }

    public String getNomLivre() {
        return nomLivre;
    }

    public void setNomLivre(String nomLivre) {
        this.nomLivre = nomLivre;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public String getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(String dateEdition) {
        this.dateEdition = dateEdition;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    public void Ouvrir(int num){
        System.out.println("#################################### OUVERTURE DU LIVRE ####################################");
        if(this.nombre == 0){
            System.out.println("il n'y a donc pas encore de livre ");
        }
        else if(this.nombre >= num && num >=1){
            System.out.println("Le livre maintenant ouvert a la page "+num);
        }else{
            System.out.println("le livre ne possede pas cette page");
        }
        
    }
    @Override
    public String toString() {
        return " Livrec [dateEdition=" + dateEdition + ", maisonEdition=" + maisonEdition + ", nomAuteur=" + nomAuteur
                + ", nomLivre=" + nomLivre + ", nombre=" + nombre + "]";
    }
    
    public void Afficher(){
        System.out.println("\n #################################### INFORMATION DU LIVRE #################################### \n ");
        System.out.println(toString());


    }

  
    
    


    /* LES ACCESEURS ET LES MUTATEURS */


    
}