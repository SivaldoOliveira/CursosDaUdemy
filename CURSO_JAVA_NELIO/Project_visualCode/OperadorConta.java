import static javax.swing.JOptionPane.*;

public class OperadorConta {
    public static void main(String[] args) {
        Conta conta = null;
        String str;

        while (true) {
            str = "Informe o número da conta";
            str = showInputDialog(str);
            if (str == null)
                System.exit(0);

            try {
                conta = new Conta(str);
                break;
            } catch (Exception ex) {
                showMessageDialog(null, "Número inválido!", "Erro", 0);
            }
        }

        while (true) {
            str = "Informe o limite da conta";
            str = showInputDialog(str);
            if (str == null)
                System.exit(0);

            try {
                conta.setLimite(str);
                break;

            } catch (Exception ex) {
                showMessageDialog(null, ex.getMessage(), "Erro", 0);
            }
        }

        while (true) {
            str = "Que operação deseja realizar?" + "\nD = Depósito \nS = saque";

            str = showInputDialog(str);
            if (str == null)
                System.exit(0);
            String operacao = str.trim().toUpperCase();

            if (!operacao.equals("D") && !operacao.equals("S")) {
                showMessageDialog(null, "Operação inválida!", "Erro", 0);
                continue;

            }

            str = "Informe o valor da operação";
            str = showInputDialog(str);
            if (str == null)
                System.exit(0);

            double valor = Double.parseDouble(str);

            if (operacao.equals("D"))
                conta.depositar(valor);

            if (operacao.equals("S"))
                try {
                    conta.sacar(valor);
                } catch (Exception ex) {
                    showMessageDialog(null, ex.getMessage(), "Erro", 0);
                }

            showMessageDialog(null, conta);
        }
    }

}
