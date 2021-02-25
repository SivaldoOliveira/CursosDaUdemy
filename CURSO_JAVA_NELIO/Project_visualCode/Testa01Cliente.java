public class Testa01Cliente {
    
    public static void main(String[] args){
        Cliente Cliente3 = new Cliente();
        Cliente Cliente4 = new Cliente();

        Cliente3.nome = "Manoel luiz";
        Cliente3.email = "João Marcos";
        Cliente3.credito = 3000;

        Cliente4.nome = "Vansesa leite";
        Cliente4.email = "vande@gmail.com";
        Cliente4.credito = 5000;

        System.out.println("Dados do primeiro Cliente:");
        System.out.println("Nome:\t\t"+ Cliente3.nome);
        System.out.println("Email: \t" + Cliente3.email);
        System.out.println("Crédito: \t" + Cliente3.credito);

        System.out.println("Dados do segundo Cliente:");
        System.out.println("Nome:\t\t" + Cliente4.nome);
        System.out.println("Email: \t" + Cliente4.email);
        System.out.println("Crédito: \t"+ Cliente4.credito);



    }
}
