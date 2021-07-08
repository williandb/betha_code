//import java.util.Arrays;

//Escreva um programa que some todos os valores contidos em um array de inteiros e calcule a média.
public class Desafio03Exercicio02 {
    public static void main(String[] args) {
        int[] arrayInteiros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //System.out.println(Arrays.stream(arrayInteiros).average());
        double soma = 0;
        for(int i = 0; i < arrayInteiros.length; i++){
            soma += arrayInteiros[i];
        }
        System.out.println(soma / arrayInteiros.length);
    }
}