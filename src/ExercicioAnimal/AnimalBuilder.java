package ExercicioAnimal;

public class AnimalBuilder {
    public static Animal criarAnimal(String tipo, String nome, String raca, String som, Integer qtdPatas){
        if(tipo.equals("GATO")){
            return new Gato(nome, raca, som, qtdPatas);
        }

        if(tipo.equals("CACHORRO")){
            return new Cachorro(nome, raca, som, qtdPatas);
        }

        if(tipo.equals("JACARE")){
            return new Jacare(nome, raca, som, qtdPatas);
        }
        return new Animal(nome,raca);
    }
}
