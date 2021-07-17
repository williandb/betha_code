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
        Matricula matricula = criarMatricula("Funcionario");
        matricula.setSalario(100.0);
    }
}
