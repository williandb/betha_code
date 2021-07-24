package ExercicioAnimal;

public class Cachorro extends Animal{
    public Cachorro(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Cachorro(String nome, String raca, Integer qtdPatas) {
        super(nome, raca, qtdPatas);
    }

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom() {
        return "O cachorro faz "+super.getSom();
    }
}
