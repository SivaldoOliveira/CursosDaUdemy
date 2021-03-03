import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[]args){
        Aluno alu = new Aluno();

        String str = "Dados do aluno: ";
        str += "\n" + alu.matricula + ": " + alu.nome;
        JOptionPane.showMessageDialog(null,str);

        alu.matricula = -15;
        alu.nome = "";

        str = "Dados do aluno";
        str += "\n"+ alu.matricula + ": "+ alu.nome;
        JOptionPane.showMessageDialog(null, str);

        System.exit(0);
    }
    
}
