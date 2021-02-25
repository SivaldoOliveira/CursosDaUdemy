import javax.swing.JOptionPane;



public class Finally {
    public static void main(String[] args){
        String str ="Informe um número";
        str = JOptionPane.showInputDialog(null,str);
        if(str == null) System.exit(0);

        try{
            int numero = Integer.parseInt(str);
            JOptionPane.showMessageDialog(null, "Número válido!");
        }

        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Dado inválido!","Erro",0);
        }
finally{
    JOptionPane.showMessageDialog(null,"Operação encerrada!");
    System.exit(0);
}
    }
    
}
