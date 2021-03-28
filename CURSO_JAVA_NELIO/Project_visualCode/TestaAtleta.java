import javax.swing.JOptionPane;

public class TestaAtleta {
    public static void main(String[] args) {
        Atleta sivaldo = new Atleta("Sivaldo M.", Atleta.SEXO_MASCULINO);
        JOptionPane.showMessageDialog(null, sivaldo);
        Atleta riu = new Atleta("Riu A.", Atleta.SEXO_FEMININO);
        JOptionPane.showMessageDialog(null, riu);

    }
}
