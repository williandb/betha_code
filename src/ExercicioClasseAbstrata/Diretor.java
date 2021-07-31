package ExercicioClasseAbstrata;

public class Diretor extends Gerente{
    public Diretor(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getSalario() {
        return super.getSalario()*1.2;
    }
}
