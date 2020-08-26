package Uml;

public class Agent extends Personne {

    private String numeroMat;

    public Agent(String nom, String prenom, String numeroTelephone) {
        super(nom, prenom, numeroTelephone);
        numeroMat = "";
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom);
    }

    @Override
    public String getPrenom() {
        return super.getPrenom();
    }

    @Override
    public void setPrenom(String prenom) {
        super.setPrenom(prenom);
    }

    @Override
    public String getNumeroTelephone() {
        return super.getNumeroTelephone();
    }

    @Override
    public void setNumeroTelephone(String numeroTelephone) {
        super.setNumeroTelephone(numeroTelephone);
    }

    /**
     * @return get numero-telephone
     */
    public String getNumeroMat() {
        return numeroMat;
    }
    /**
     *  @return set numero-telephone
     */

    public void setNumeroMat(String numeroMat) {
        this.numeroMat = numeroMat;
    }
}