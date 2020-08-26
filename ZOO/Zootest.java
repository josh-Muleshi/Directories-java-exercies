/**
 * Zootest
 */

import java.util.List;
import java.util.ArrayList;

public class Zootest {

    public static void main(String[] args) {
        List<Animal> Mesanimaux = new ArrayList<>();
        List<Cage> mesCage = new ArrayList<>();
        Zoo zoo = new Zoo();
        Cage cage1 = new Cage();
        Cage cage2 = new Cage();
        Animal animal1 = new Animal("rex","carnivore");
        Animal animal2 = new Animal("dax","carnivore");
        Animal animal3 = new Animal("onu","carnivore");
        Animal animal4 = new Animal("max","carnivore");
        Animal animal5 = new Animal("sousou","herbivore`");
        Animal animal6 = new Animal("serpent","reptil");
        
        Mesanimaux.add(animal1);
        Mesanimaux.add(animal2);
        Mesanimaux.add(animal3);
        Mesanimaux.add(animal4);
        Mesanimaux.add(animal5);
        Mesanimaux.add(animal6);

        mesCage.add(cage1);
        mesCage.add(cage2);

        cage1.setAnimal(Mesanimaux);
        zoo.setCage(mesCage);

    }
}