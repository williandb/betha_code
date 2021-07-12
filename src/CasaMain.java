public class CasaMain {
    static class Casa{
        private String endereco;
        private Integer numeroSalas;
        private Integer numeroQuartos;
        private double metragem;
        private String tipoMaterial;

        public Casa(String endereco, Integer numeroSalas, Integer numeroQuartos, double metragem, String tipoMaterial) {
            this.endereco = endereco;
            this.numeroSalas = numeroSalas;
            this.numeroQuartos = numeroQuartos;
            this.metragem = metragem;
            this.tipoMaterial = tipoMaterial;
        }

        public Integer getNumeroSalas() {
            return numeroSalas;
        }

        public void setNumeroSalas(Integer numeroSalas) {
            this.numeroSalas = numeroSalas;
        }

        public Integer getNumeroQuartos() {
            return numeroQuartos;
        }

        public void setNumeroQuartos(Integer numeroQuartos) {
            this.numeroQuartos = numeroQuartos;
        }

        public double getMetragem() {
            return metragem;
        }

        public void setMetragem(double metragem) {
            this.metragem = metragem;
        }

        public String getTipoMaterial() {
            return tipoMaterial;
        }

        public void setTipoMaterial(String tipoMaterial) {
            this.tipoMaterial = tipoMaterial;
        }

        @Override
        public String toString() {
            return "Casa{" +
                    "endereco='" + endereco + '\'' +
                    ", numeroSalas=" + numeroSalas +
                    ", numeroQuartos=" + numeroQuartos +
                    ", metragem=" + metragem +
                    ", tipoMaterial='" + tipoMaterial + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Casa casa = new Casa("Rua Delinda Favarin Vittorassi, 549", 2,4, 200.0, "Alvenaria");
        System.out.println(casa.toString());
    }
}
