import javax.swing.JOptionPane;

public class ValidandoInteiro {
    public static void main(String[] args){
        String  str;
        int numero = 0;

        while (numero < 1 || numero > 10){
            str = "Informe um número inteiro";
            str = JOptionPane.showInputDialog(null, str);
            if ( str == null) System.exit(0);

            try{
                numero = Integer.parseInt(str);

                if ( numero < 1){
                    str = "O número deve ser maior que zero!";
                    throw new IllegalArgumentException(str);
                }

                if(numero > 10){
                    str ="O número não deve ser maior que dez!";
                    throw new IllegalArgumentException(str);
                }
            }
            
           
            catch (NumberFormatException nfe){
                str = "Número inválido: " + str;
                JOptionPane.showMessageDialog(null, str,"Erro",0);
            }
            catch (IllegalArgumentException iae){
                JOptionPane.showMessageDialog(null,iae.getMessage(), "Erro", 0);
            }
        }

        JOptionPane.showMessageDialog(null, "Número válido: " + numero);
        System.exit(0);
      }
    
}
