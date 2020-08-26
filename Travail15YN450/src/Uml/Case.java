package Uml;

import java.util.List;

public class Case {
    private String address;
    private int numero;
    public Agent agent;
    //public List<Agent> = Agent

    public Case() {
        this.address = address;
        this.numero = numero;
        this.agent = agent;
    }
    public Case(String address, int numero, Agent agent){
        this.address = address;
        this.numero = numero;
        this.agent = agent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

}
