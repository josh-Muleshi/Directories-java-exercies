package Java.Ex03;

public class Advance {

    public Advance(int i) { // ceci accpete !
        System.out.println("Hello");
    }
//    void A(int i){
//        System.out.println("Hello"); // ceci ne passera pas
//                                     // parceque le constructeur ne peut avoir
//                                     // un type de retoure!
//    }
    public static void main(String[] args){
        Advance unA = new Advance(5);
    }
}
