public class TestaCliente {
 public static void main (String[] args){
     Cliente cliente1 = new Cliente();
     Cliente cliente2 = new Cliente();

     cliente1.nome = "Raquel Farias";
     cliente1.email = "raquel@gmail.com";
     cliente1.credito = 1500;

     cliente2.nome = "Sivaldo Muniz";
     cliente2.email = "sivaldo@hotmail.com";
     cliente2.credito = 2000;

     System.out.println("Dados do primeiro cliente:");
     System.out.println("Nome: \t\t"+ cliente1.nome);
     System.out.println("Email: \t"+ cliente1.email);
     System.out.println("Crédito:\t" + cliente1.credito);
     
     System.out.println("Dados do segundo Cliente:");
     System.out.println("Nome: \t\t" + cliente2.nome);
     System.out.println("Email: \t" + cliente2.email);
     System.out.println("Crédito: \t" + cliente2.credito);

 }
}
