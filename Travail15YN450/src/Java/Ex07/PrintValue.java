package Java.Ex07;

public class PrintValue {
    class Test {
        int a;
        int c;
        Test (int b) {
            a = b;
        }
        public int donneC() { // changez static en public
            return c;
        }
//        static int donneC() {
//            return c;
//        }
    }
        public static void main(String[] args)
        {
            PrintValue.Test unTest =  new PrintValue().new Test(5);
            System.out.println(unTest.a);
        }
}
