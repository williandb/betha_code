import javax.swing.JOptionPane;

public class PessoaMain {
    static class Pessoa{
        //Criar uma classe de pessoa, com os atributos nome, cpf, rg, altura, peso, data nascimento, filiação.
        private String nome;
        private String cpf;
        private String rg;
        private Double altura;
        private Double peso;
        private String dataNascimento;
        private String filiacao;

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public void setAltura(Double altura) {
            this.altura = altura;
        }

        public void setPeso(Double peso) {
            this.peso = peso;
        }

        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public void setFiliacao(String filiacao) {
            this.filiacao = filiacao;
        }

        public double getIMC(){
            return peso / Math.pow(altura, 2);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Willian Dagostin Bittencourt");
        pessoa.setCpf("04360096925");
        pessoa.setRg("3550127");
        pessoa.setAltura(1.60);
        pessoa.setPeso(70.0);
        pessoa.setDataNascimento("17/09/1984");
        pessoa.setFiliacao("-----");

        JOptionPane.showMessageDialog(null,pessoa.nome + " tem seu IMC igual a "+pessoa.getIMC());
    }
}
