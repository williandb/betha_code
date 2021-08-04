package Exemplos;

public class AnimalMain {
    static class Animal{
        private String nome;
        private Double peso;
        private Double altura;
        private String som;

        public Animal(String nome, Double peso, Double altura, String som) {
            this.nome = nome;
            this.peso = peso;
            this.altura = altura;
            this.som = som;
        }

        public String getNome() {
            return nome;
        }

        public Double getPeso() {
            return peso;
        }

        public Double getAltura() {
            return altura;
        }

        public String getSom() {
            return som;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPeso(Double peso) {
            this.peso = peso;
        }

        public void setAltura(Double altura) {
            this.altura = altura;
        }

        public void setSom(String som) {
            this.som = som;
        }

        public void emiteSomAnimal(){
            System.out.println(som);
        }

        public void pular(double altura){
            System.out.println("O animal pula a uma altura de "+altura);
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Gato", 10.0, 40.0, "Miau");

        animal.emiteSomAnimal();
        animal.pular(1.5);
    }
}
