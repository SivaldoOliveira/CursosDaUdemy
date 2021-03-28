import java.util.Scanner;

public class Kilometragem {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double VelocidadeMedia, TempoGasto, Autonomia = 12;
        double Distancia, LitroUsados;

        System.out.print("Prograama de cálculo da quantidade de litros de combustível gasta em uma viagem\n\n");

        System.out.print("Por favor, digita o tempo que você gastou em sua viagem(horas): ");
        TempoGasto = entrada.nextDouble();

        System.out.print("Por favor, agora digite a Velocidade mèdia em que você fez o percurso(Km/h): ");
        VelocidadeMedia = entrada.nextDouble();

        Distancia = VelocidadeMedia * TempoGasto;
        LitroUsados = Distancia / Autonomia;

        System.out.print("\n\nResultado; \n\n");
        System.out.print("Velocidade média = " + VelocidadeMedia + " Km/h \n");
        System.out.print("Tempo gasto = " + TempoGasto + " horas\n");
        System.out.print("Distancia Percorrida= " + Distancia + "Km\n");
        System.out.print("Quantidade de Combustível utilizado: " + LitroUsados + " Litros\n");
    }
}
