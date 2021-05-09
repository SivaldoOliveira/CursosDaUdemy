import javax.swing.JOptionPane;

public class CadastroClientePessoa {
    public static void main(String[] args) {
        ClientePessoa Sivaldo = new ClientePessoa();
        Sivaldo.setNome(new String("Sivaldo Muniz"));
        Sivaldo.setFone(new String("(11) -96754-5443"));
        Sivaldo.setRG(new String("4.235.345-67"));
        Sivaldo.setFone(new String("939.167.234-34"));

        String str = "Dados do Cliente: \n" + "\nNome: " + Sivaldo.getNome() + "\nFone: " + Sivaldo.getFone()
                + "\nRg:  " + Sivaldo.getRG() + "\nCPF: " + Sivaldo.getCPF();

        JOptionPane.showMessageDialog(null, str, "Mesagem", 1);

        ClientePessoa argemiro = new ClientePessoa("Argemiro Vieira", "(45)4785-8965", "4.890.967-3", "345.574.565-56");

        str = "Dados do Cliente:\n" + "\nNome: " + argemiro.getNome() + "\nFone: " + argemiro.getFone() + "\nRG: "
                + argemiro.getRG() + "\nCPF: " + argemiro.getCPF();
        JOptionPane.showMessageDialog(null, str, "Mensagem", 1);

        System.exit(0);

    }

}
