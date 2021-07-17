package Calcudora;

public class CalculadoraMain {
    public static class calculadora {
        public static Integer calcular(int a, int b) {
            return a + b;
        }

        public static Double calcular(double a, double b) {
            return a + b;
        }

        public static String calcular(String a, String b) {
            return a + b;
        }
    }
    public static void main(String[] args) {

        System.out.println(calculadora.calcular(1,2));
        System.out.println(calculadora.calcular(1.5,2.7));
        System.out.println(calculadora.calcular("Willian ","Bittencourt"));
    }
}
