package Uml;

public class Visiteur {
    public Case aCase;
    public Agent agent;

    public Visiteur(Case aCase, Agent agent) {
        this.aCase = aCase;
        this.agent = agent;
    }

    public void choisirCase(Case aCase){
        System.out.println("choisir votre case" + aCase.getNumero());
    }
    public void demanderRens(Agent agent){
        System.out.println("agent " + agent.getNom());
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
