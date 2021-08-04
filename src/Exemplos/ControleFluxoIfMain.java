package Exemplos;

import java.sql.SQLOutput;

public class ControleFluxoIfMain {
    public static void main(String[] args) {
        int ano = 2020;
        if (ano < 0) {
            System.out.println("Não é um ano");
        } else if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É bisexto");
        } else {
            System.out.println("Não é bisexto");
        }

        if (10 == 20) {
            System.out.println("É igual");
        } else {
            System.out.println("É diferente");
        }

        double altura = 1.4;
        if (altura < 1.5) {
            System.out.println("É baixo");
        } else {
            System.out.println("É alto");
        }

        double salario = 15000.00;
        System.out.println(salario);
        if (salario >= 15000.00) {
            System.out.println("Carrion");
        } else {
            System.out.println("Outro");
        }
    }
}
