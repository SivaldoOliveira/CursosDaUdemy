public class Autor {
    private int codigo;
    private String nome;

    public Autor(){
        nome = "";
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }
    
    public void setCodigo(int codigo) throws Exception{
        if (codigo < 1)
        throw new IllegalArgumentException("Código abaixo do mínimo!");

        this.codigo = codigo;
    }
    public void setCodigo(String codigo) throws Exception{
        try{
            setCodigo (Integer.parseInt(codigo));
        }
        catch (NumberFormatException nfe){
            throw new NumberFormatException("Código inválido!");
        }
    }

    public void setNome (String nome) throws Exception{
        if (nome == null)
        throw new NullPointerException("O nome não pode ser nulo!");

        nome = nome.trim();

        if(nome.length()< 5 || nome.length() > 50)

        throw new IllegalArgumentException("Nome inválido!");

        this.nome = nome;
    }
}
