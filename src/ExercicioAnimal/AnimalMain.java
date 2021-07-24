package ExercicioAnimal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal gato = AnimalBuilder.criarAnimal("GATO","teste", "raca", "Miau", 4);
        System.out.println(gato.getSom());
        System.out.println(gato.getSom(" outro miau"));

        Animal cachorro = AnimalBuilder.criarAnimal("CACHORRO","teste", "raca", "AU AU", 4);
        System.out.println(cachorro.getSom());
        System.out.println(cachorro.getSom(" AUUUUUUU"));

        Animal jacare = AnimalBuilder.criarAnimal("JACARE","teste", "raca", "GRRRR", 4);
        System.out.println(jacare.getSom());
        System.out.println(jacare.getSom(" GRRR"));
    }
}
