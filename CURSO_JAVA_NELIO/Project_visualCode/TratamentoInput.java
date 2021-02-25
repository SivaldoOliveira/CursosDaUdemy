import java.util.Scanner;
import java.util.InputMismatchException;

public class TratamentoInput {
    public static void main(String[]args){
        byte idade = -1;

        while(idade < 0){
            System.out.print("\nInforme sua idade: \t");
            Scanner scan = new Scanner(System.in);
        
        
        try{
            idade = scan.nextByte();
        }
catch (InputMismatchException ime){

System.out.println("Idade inválida!");

}
}    

        System.out.println("Sua idade: \t\t" + idade);
    }
    
}
