public class Computador {
    private int codigo;
    private String descricao;

    public Computador(int codigo, String descricao) throws Exception {
        if (codigo < 1)
            throw new Exception("Código abaixo do mínimo!");

        if (descricao == null)
            throw new Exception("Descrição nula!");

        descricao = descricao.trim();

        if (descricao.length() < 5 || descricao.length() > 50)
            throw new Exception("Descrição inválida!");

        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String toString() {
        return "Computador " + codigo + ": " + descricao;
    }

}
