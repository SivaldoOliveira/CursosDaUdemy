public class Livro {
    private int codigo;
    private String titulo;

    public Livro(){
        titulo = "";
    }

    public int getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setCodigo (int codigo) throws IllegalArgumentException {
        if (codigo < 1)
          throw new IllegalArgumentException( "Código inválido");
                  
          this.codigo = codigo;
    }

    public void setTitulo (String titulo)
    throws NullPointerException, IllegalArgumentException{
        if (titulo == null)
        throw new NullPointerException("O título não pode ser nulo!");

        titulo = titulo.trim();

        if(titulo.length() < 5 || titulo.length() > 50)
        throw new IllegalArgumentException("Titulo inválido!");

        this.titulo = titulo;
    }


}
