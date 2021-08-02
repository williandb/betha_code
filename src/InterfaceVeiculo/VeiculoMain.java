package InterfaceVeiculo;

public class VeiculoMain {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca","1234", "1300", "Volkswagen");

        System.out.println("Nome: "+fusca.getNome());
        System.out.println("ID: "+fusca.getId());
        System.out.println("Modelo: "+fusca.getModelo());
        System.out.println("Fabricante: "+fusca.getFabricante());
    }
}
