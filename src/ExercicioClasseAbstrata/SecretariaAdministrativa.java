package ExercicioClasseAbstrata;

public class SecretariaAdministrativa extends Secretaria{
    public SecretariaAdministrativa(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return super.getSalario() * 1.07;
    }
}
