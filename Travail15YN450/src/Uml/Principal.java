package Uml;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){
        Zoo zoo = new Zoo();
        Case aCase1 = new Case();
        Case aCase2 = new Case();

        List<Animal> mesanimaux = new ArrayList<Animal>();

        Animal animal1 = new Animal("Lion", "carnivor");
        Animal animal2 = new Animal("Renard","Crutase");
        Animal animal3 = new Animal("Tiger","carnivoir");


        mesanimaux.add(animal1);
        mesanimaux.add(animal2);
        mesanimaux.add(animal3);

    }
}
