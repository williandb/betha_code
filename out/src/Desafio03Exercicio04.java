import java.util.Scanner;
import javax.swing.JOptionPane;

//Faça um programa que receba entrada de dados  e informe ao usuário através de uma caixa de diálogo qual foi o dados passados.
public class Desafio03Exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();
        System.out.print("Digite idade: ");
        int idade = s.nextInt();
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+ idade);
    }
}
