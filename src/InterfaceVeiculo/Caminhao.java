package InterfaceVeiculo;

public class Caminhao implements Veiculo, Motor{
    private String nome;
    private String id;
    private String modelo;
    private String fabricante;

    public Caminhao(String nome, String id, String modelo, String fabricante) {
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
        return this.getNome();
    }

    @Override
    public String getId() {
        return this.getId();
    }

    @Override
    public String getModelo() {
        return this.getModelo();
    }

    @Override
    public String getFabricante() {
        return this.getFabricante();
    }
}
