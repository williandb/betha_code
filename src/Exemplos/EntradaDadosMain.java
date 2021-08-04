package Exemplos;

import java.util.Scanner;

public class EntradaDadosMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma linha: ");
        String linha = s.nextLine();
        System.out.print("Digite um número: ");
        int i = s.nextInt();
        System.out.print("Digite um número: ");
        double d = s.nextDouble();

        System.out.println("Imprime linha: "+linha+"\ninteiro: "+i+"\ndouble: "+d);
    }
}
