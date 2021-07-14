package Desafio03;

//Crie um programa que percorra um array de 10 posições e imprima o seu conteúdo.
public class Desafio03Exercicio01 {
    public static void main(String[] args) {
        int[] arrayInteiros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i = 0; i < arrayInteiros.length; i++){
            System.out.println(arrayInteiros[i]);
        }
    }
}
