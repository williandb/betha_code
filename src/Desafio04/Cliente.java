package Desafio04;

public class Cliente extends PessoaFisica{
    private Double limiteCrediario;
    private Double limiteUtilizado;

    public Cliente(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double limiteCrediario, Double limiteUtilizado) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.limiteCrediario = limiteCrediario;
        this.limiteUtilizado = limiteUtilizado;
    }

    public Double getLimiteCrediario() {
        return limiteCrediario;
    }

    public void setLimiteCrediario(Double limiteCrediario) {
        this.limiteCrediario = limiteCrediario;
    }

    public Double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    public void aumentarLimite(double valor){
        this.limiteCrediario += valor > 0.0 ? valor : 0.0;
    }

    public void reduzirLimite(double valor){
        this.limiteCrediario -= valor > 0.0 ? valor : 0.0;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "limiteCrediario=" + limiteCrediario +
                ", limiteUtilizado=" + limiteUtilizado +
                '}';
    }
}
