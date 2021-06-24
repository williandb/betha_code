/*
Implemente um programa para calcular a área de um trapézio, onde: h = altura b = base menor B = base maior Área = (h.(b+B))/2
 */
import java.util.Scanner;
public class Desafio02Exercicio05 {
    public static void main(String[] args) {
        double areaTrapezio;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira a altura do Trapézio: ");
        double altura = s.nextDouble();

        System.out.print("Insira a menor base do Trapézio: ");
        double baseMenor = s.nextDouble();

        System.out.print("Insira a maior base do Trapézio: ");
        double baseMaior = s.nextDouble();

        areaTrapezio = (altura*(baseMenor+baseMaior))/2;

        System.out.print("A área do trapézio é: "+areaTrapezio);
    }
}
