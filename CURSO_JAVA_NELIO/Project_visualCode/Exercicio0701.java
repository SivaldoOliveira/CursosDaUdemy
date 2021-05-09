import javax.swing.JOptionPane;

public class Exercicio0701 {

    public static void main(String[] args) {
        String st = "Informe seu nome:";
        st = JOptionPane.showInputDialog(null, st);

        if (st == null)
            System.exit(0);

        if (st.length() < 5 || st.length() > 50)
            System.exit(0);

        st = "Nome informado: " + st;
        JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
    }

}
