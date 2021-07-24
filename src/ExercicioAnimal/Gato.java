package ExercicioAnimal;

public class Gato extends Animal{

    public Gato(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Gato(String nome, String raca, Integer qtdPatas) {
        super(nome, raca, qtdPatas);
    }

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom() {
        return "O gato faz "+super.getSom();
    }
}
