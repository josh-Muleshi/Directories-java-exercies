package Java.Ex06;

public class Principe {
    class Test {
        int a;

        Test(int b) {
            a = b;
        }
    }
    public static void main(String[] args) {
       Principe.Test unTest = new Principe().new Test(20);
       System.out.println( "Valeur = " + unTest.a);
    }

    // Dans cette exercice j'ai creer une classe dans une classe
    // Et pour corriger l'erreur on exstencie la classe princcipal suivit de la seconde
    // En ajoutant la valeur du paramettre
}
