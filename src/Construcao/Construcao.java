package Construcao;

public class Construcao {
    private Double metragem;
    private Integer numeroQuartos;
    private Integer numeroSalas;
    private Integer numeroBanheiros;

    public Construcao(Double metragem, Integer numeroQuartos, Integer numeroSalas, Integer numeroBanheiros) {
        this.metragem = metragem;
        this.numeroQuartos = numeroQuartos;
        this.numeroSalas = numeroSalas;
        this.numeroBanheiros = numeroBanheiros;
    }

    public Double getMetragem() {
        return metragem;
    }

    public void setMetragem(Double metragem) {
        this.metragem = metragem;
    }

    public Integer getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(Integer numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public Integer getNumeroSalas() {
        return numeroSalas;
    }

    public void setNumeroSalas(Integer numeroSalas) {
        this.numeroSalas = numeroSalas;
    }

    public Integer getNumeroBanheiros() {
        return numeroBanheiros;
    }

    public void setNumeroBanheiros(Integer numeroBanheiros) {
        this.numeroBanheiros = numeroBanheiros;
    }
}