import jdk.jshell.Diag;

public class TesteDialogo {
    public static void main(String[] args) {
        String str = Dialogo.captar("Qual é seu nome?");
        if (str != null)
            Dialogo.exibir("olá " + str + "!");
        System.exit(0);
    }
}
