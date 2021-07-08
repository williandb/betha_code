import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Informe o valor para saque: ");
        int valorRetirada = n.nextInt();

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        int quantidadeTotal = 0;

        int valorReais = valorRetirada;

        for(int i = 0; i < cedulas.length; i++){
            int quantidadeCedulas = valorReais / cedulas[i];
            System.out.println("Quantidade de cédulas de "+cedulas[i]+": "+quantidadeCedulas);
            valorReais %= cedulas[i];
            quantidadeTotal += quantidadeCedulas;
        }
        System.out.println("Quantidade Total: "+quantidadeTotal);
    }
}
