package ExercicioAnimal;

public class Jacare extends Animal{
    public Jacare(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Jacare(String nome, String raca, Integer qtdPatas) {
        super(nome, raca, qtdPatas);
    }

    public Jacare(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom() {
        return "O jacaré faz "+super.getSom();
    }
}
