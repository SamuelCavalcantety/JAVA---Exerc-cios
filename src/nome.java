import java.util.Scanner;

public class nome{
    public static void main ( String[] args)
    {
        Scanner teclado = new Scanner (System.in);
                System.out.println("Digite o seu nome: ");
                String nome = teclado.nextLine();
                System.out.println("Digite o seu sobrenome: ");
                String sobrenome = teclado.nextLine();
                System.out.println("Seu sobrenome é " + sobrenome+  " já o seu nome é " +nome + ".");
    }
}
