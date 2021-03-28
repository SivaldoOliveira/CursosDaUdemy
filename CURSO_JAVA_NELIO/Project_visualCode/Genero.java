public class Genero {
    private int codigo;
    private String descricao;

    public Genero() {
        descricao = "";

    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void SetDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "Genero " + codigo + ": " + descricao;
    }

}
