package ExercicioClasseAbstrata;

public class FuncionarioMain {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente da silva",1000.0);
        System.out.println("Bonificação Gerente: "+ gerente.getSalario());

        Presidente presidente = new Presidente("Presidente de oliveira",2000.0);
        System.out.println("Bonificação Presidente: "+ presidente.getSalario());

        Diretor diretor = new Diretor("Diretor Correa", 500.0);
        System.out.println("Bonificação Diretor: "+ diretor.getSalario());
    }
}
