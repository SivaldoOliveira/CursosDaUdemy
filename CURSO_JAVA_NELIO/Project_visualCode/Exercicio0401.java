import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio0401 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.print("\nInforme seu Nome:\t");
        String nome = scan.nextLine();

        System.out.print("\nSexo (M ou F):");
        String sexo = scan.nextLine();

        System.out.print("\nRenda Familiar:");
        double renda = scan.nextDouble();

        System.out.println("DADOS GRAVADOS:");
        System.out.printf("Nome: %s", nome);
        System.out.printf("Sexo: %s", sexo);
        System.out.printf("Renda : %d", renda);

        System.out.println();

    }

}
