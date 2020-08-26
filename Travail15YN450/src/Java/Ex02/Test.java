package Java.Ex02;

public class Test {
    // Soit la déclaration de la méthode suivante!
    public void test(int a){}
    //Quelles sont les surcharges admises parmi ces différentes possibilités ?
    //========================================================================
        public void test() {}                   // Surchage
        public void test(double a) {}           // Surchage
        public void test(int a, int b) {}       // Surchage
    //========================================================================
    //public  int test(int a) {} // N'accepte pas la Surchage!
}
