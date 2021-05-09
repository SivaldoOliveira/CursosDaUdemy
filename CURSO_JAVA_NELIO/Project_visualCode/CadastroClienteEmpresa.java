import javax.swing.JOptionPane;

public class CadastroClienteEmpresa {
    public static void main(String[] args) {
        ClienteEmpresa silva = new ClienteEmpresa();
        silva.setNome("Muniz & Oliveira");
        silva.setFone("(11)-96565-5923");
        silva.setIE("657.355.56.89");
        silva.setCNPJ("898.894.439-87");

        String st = "Dados do Cliente: \n" + "\nNome: " + silva.getNome() + "\nFone: " + silva.getFone() + "\nIE: "
                + silva.getIE() + "\nCNPJ: " + silva.getCNPJ();

        JOptionPane.showMessageDialog(null, st, "Messagen", 1);

    }

}
