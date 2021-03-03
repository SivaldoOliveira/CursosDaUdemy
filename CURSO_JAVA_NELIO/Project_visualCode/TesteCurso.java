import javax.swing.JOptionPane;

public class TesteCurso {
    public  static void main(String [] args){
        Curso cur = new Curso();

        String str = "Dados do cursos: ";
        str += "\n"  + cur.getCodigo() + ": " + cur.getDescricao();
        JOptionPane.showMessageDialog(null,str);

        cur.setCodigo(1);
        cur.setDescricao("Sistemas da Informação");


        str = "Dados do curso: ";
        str += "\n" + cur.getCodigo() + ": "+ cur.getDescricao();
        JOptionPane.showMessageDialog(null, str);
        
        cur.setCodigo(-15);
        cur.setDescricao(null);


        str = "Dados do curso: ";
        str += "\n"+ cur.getCodigo()+ ":  "+ cur.getDescricao();
        JOptionPane.showMessageDialog(null,str);     

        System.exit(0);
    }
    
}
