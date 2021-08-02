package InterfaceVeiculo;

public class Carro implements Veiculo,Motor{
    private String nome;
    private String id;
    private String modelo;
    private String fabricante;

    public Carro(String nome, String id, String modelo, String fabricante) {
        this.nome = nome;
        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
