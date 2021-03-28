import javax.swing.JOptionPane;

public class Exercicio0302 {

    public static void main(String[] args) {

        String nm = JOptionPane.showInputDialog(null, "Informe seu nome");
        String em = JOptionPane.showInputDialog(null, "Informe seu e-mail");

        System.out.println("\r Cadastro confirmado!");
        System.out.printf("\rNome: \t %s \n e-mail: %s\n\n", nm, em);

    }
}
