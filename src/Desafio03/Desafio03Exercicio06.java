package Desafio03;//Desenvolva um programa que calcule o IMC com telas gráficas usando JOptionPane.
import javax.swing.JOptionPane;

public class Desafio03Exercicio06 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu altura"));

        JOptionPane.showMessageDialog(null, "Seu IMC é "+(peso / Math.pow(altura,2)));
    }
}