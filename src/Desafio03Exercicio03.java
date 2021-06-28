//Faça um programa que inverta as posições de um array com 10 elementos.
public class Desafio03Exercicio03 {
    public static void main(String[] args) {
        System.out.println("1º Método");
        int[] arrayInteiros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int aux = 0;
        for(int i = 0; i < (arrayInteiros.length/2); i++){
            aux = arrayInteiros[i]; //10
            arrayInteiros[i] = arrayInteiros[arrayInteiros.length-i-1]; //100
            arrayInteiros[arrayInteiros.length-i-1] = aux;
        }
        for(int i = 0; i < arrayInteiros.length; i++){
            System.out.println(arrayInteiros[i]);
        }

        System.out.println("2º Método");
        arrayInteiros = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] arrayAux = new int[arrayInteiros.length];
        for(int i = 0; i < arrayInteiros.length; i++){
            arrayAux[arrayInteiros.length-i-1] = arrayInteiros[i];
        }
        for(int i = 0; i < arrayAux.length; i++){
            System.out.println(arrayAux[i]);
        }
    }
}
