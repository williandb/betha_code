public class OrientacaoMain {
    static class Documento{
        String foto;
        String nome;
        Integer codigo;
        String dataNascimento;
    }

    public static void main(String[] args) {
        Documento documento1;

        documento1 = new Documento();

        documento1.codigo = 1;
        documento1.nome = "Willian Dagostin Bittencourt";
        documento1.foto = "willian.png";
        documento1.dataNascimento = "17/09/1984";

        System.out.println(documento1.nome);
    }
}
