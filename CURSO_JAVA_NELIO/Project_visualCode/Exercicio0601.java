import java.util.Scanner;

public class Exercicio0601 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double Kmpercorrido, TempoGasto, VelocidadeMedia;

        System.out.print("Informe:\n");

        System.out.print("A distância percorrida (em Km) : ");
        Kmpercorrido = entrada.nextDouble();

        System.out.print("O tempo gasto (em minutos): ");
        TempoGasto = entrada.nextDouble();

        TempoGasto = TempoGasto / 60;
        VelocidadeMedia = Kmpercorrido / TempoGasto;

        System.out.print("Velocidade média (km/h) : " + VelocidadeMedia);

        System.out.println();

    }

}
