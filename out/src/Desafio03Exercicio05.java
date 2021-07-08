//Desenvolva um programa que receba 10 parâmetros, inverta todas as posições e imprima o resultado.
import java.util.Scanner;

public class Desafio03Exercicio05 {
    public static void main(String[] args) {
        int[] arrayParametros = new int[10];

        Scanner s = new Scanner(System.in);
        for(int i = 0; i < arrayParametros.length; i++){
            System.out.print("Digite o valor para o parâmetro "+(i+1)+": ");
            arrayParametros[i] = s.nextInt();
        }

        int aux = 0;
        for(int i = 0; i < (arrayParametros.length/2); i++){
            aux = arrayParametros[i];
            arrayParametros[i] = arrayParametros[arrayParametros.length-i-1];
            arrayParametros[arrayParametros.length-i-1] = aux;
        }
        for(int i = 0; i < arrayParametros.length; i++){
            System.out.println(arrayParametros[i]);
        }
    }
}
