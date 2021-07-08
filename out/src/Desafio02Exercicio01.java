/*
Implemente um programa que recebe um número de 1 a 7 e imprime o dia da semana correspondente.
*/
import java.util.Scanner;

public class Desafio02Exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 7: ");
        int diaSemana = s.nextInt();

        switch(diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
