import javax.swing.JOptionPane;

public class TestaDoenca {
    public static void main(String[] args) {
        Doenca aids = new Doenca(10, "AIDS");
        Doenca cancer = new Doenca(11, "Câncer");

        JOptionPane.showMessageDialog(null, aids);
        JOptionPane.showMessageDialog(null, cancer);

        String str = "Doenças cadastradas: " + Doenca.getQuantidade();
        JOptionPane.showMessageDialog(null, str);
        System.exit(0);
    }

}
