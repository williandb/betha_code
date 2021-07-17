package Matricula;

public class MatriculaBuilder {
    public static Matricula criarMatricula(String tipo){
        if(tipo.equals("Estagiario")){
            return new Estagiario();
        } else {
            return new Funcionario();
        }
    }

    public static void main(String[] args) {
        Matricula matriculaFuncionario = criarMatricula("Funcionario");
        matriculaFuncionario.setSalario(5000.0);
        System.out.println(matriculaFuncionario.getSalario());

        Matricula matriculaEstagiario = criarMatricula("Estagiario");
        matriculaEstagiario.setSalario(1000.0);
        System.out.println(matriculaEstagiario.getSalario());
    }
}
