
import static javax.swing.JOptionPane.*;

public class CadastroGeneros {
    public static void main(String[] args) {

        Genero[] registros = new Genero[100];

        for (int indice = 0; indice < registros.length; indice++) {
            Genero gen = new Genero();
            String str;

            str = showInputDialog("Código do gênero");
            gen.setCodigo(Integer.parseInt(str));
            if (str == null)
                break;

            str = showInputDialog("Descrição do Gênero");
            gen.SetDescricao(str);

        }

    }
}
