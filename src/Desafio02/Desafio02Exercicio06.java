package Desafio02;

/*
Faça um programa que imprima os quadrados dos números inteiros ímpares entre 15 e 35.
*/
public class Desafio02Exercicio06 {
    public static void main(String[] args) {
        int quadrado;
        for(int i = 15; i <= 35; i++){
            if( i % 2 == 0){
                continue;
            }
            quadrado = i * i;
            System.out.println("O quadrado de "+i+" é "+ quadrado);
        }
    }
}
