/*
Desenvolva um programa que solicita ao usuário um número inteiro de no máximo 4 dígitos. Inverta esse número.
*/
import java.util.Scanner;

public class Desafio02Exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número de até 4 dígitos: ");
        int n = s.nextInt();
        int numeroInvertido = 0;
        while(n > 0){
            numeroInvertido *= 10;
            numeroInvertido += (n % 10);
            n /= 10;
        }
        System.out.println(numeroInvertido);
    }
}
