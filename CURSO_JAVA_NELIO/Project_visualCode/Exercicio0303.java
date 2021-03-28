import java.util.Scanner;

public class Exercicio0303 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nInforme seu nome:\t");
        String nome = scan.nextLine();

        System.out.print("\nInforme sua nacionalidade:\t");
        String naci = scan.nextLine();

        System.out.print("\nInforme seu telefone:\t");
        String fone = scan.nextLine();

        System.out.println("Cadastro confirmado!");
        System.out.printf("Nome:\t %s \nNacionalidade:\t %s \nTelefone:%s\n\n", nome, naci, fone);
    }

}
