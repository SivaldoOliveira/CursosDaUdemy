import javax.swing. JOptionPane;

public class TestePeixe {
    public static void main(String[] args){
        Peixe espada = new Peixe();
        espada.nomePopular = "Espada";
        espada.nomeCientifico = "Xiphophorus hellerii";
        espada.familia = "Poecilídeos";
        espada.origem = "América Central";
        espada.comprimento = 13;

        Peixe beijador = new Peixe("beijador", "Helostoma temminkii","Anabantídeos", "Java e Tailândia", 30);

        String str = "Dados do primeiro Peixe:\n"+
        "\nNome popular: "+ espada.nomePopular+
        "\nNome Científico "+espada.nomeCientifico+
        "\nFamília " +espada.familia+
        "\nOrigem " +espada.origem +
        "\nComprimento: "+ espada.comprimento;

        JOptionPane.showMessageDialog(null,str);

        str ="Dados do segundo peixe: \n"+
        "\nNome popular: "+ beijador.nomePopular +
        "\nNome científico "+ beijador.nomeCientifico +
        "\nFamília: "+beijador.familia+
        "\nOrigem: "+beijador.origem+
        "\nComprimento: "+beijador.comprimento;
        JOptionPane.showMessageDialog(null, str);
        System.exit(0);


    }
    
}
