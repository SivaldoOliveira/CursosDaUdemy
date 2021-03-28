import javax.swing.JOptionPane;

public class Exercicio0304 {

    public static void main(String[] args) {
        String jogo = JOptionPane.showInputDialog(null, "Informe seu 1° jogo preferido: ");
        String jogo2 = JOptionPane.showInputDialog(null, "Informe seu 2° jogo preferido: ");

        JOptionPane.showMessageDialog(null, "Seus jogos preferidos:\n1." + jogo + "\n2." + jogo2);

        System.exit(0);

    }

}