package Desafio04;

public class PessoaMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1,"Willian Dagostin Bittencourt", "Rua Teste", "48 99914-8***", "01230045625", "3550447","M", 4527.74, 4000.0);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(2,"Fulano de Tal", "Rua Teste", "0123456789","00456865000752","123456","501234");

        System.out.println(funcionario.getDocumentoPrincipal());
        System.out.println(pessoaJuridica.getDocumentoPrincipal());


        System.out.println(funcionario.toString());
        funcionario.atualizacaoDissidio(10);
        System.out.println("Novo salário: R$ "+ funcionario.getSalarioBruto());
    }
}
