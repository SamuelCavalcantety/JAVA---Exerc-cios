

// ENTRADA DE DADO (SCANNER) //

import java.util.Scanner;

public class Scnne {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
         System.out.print("Digite o seu nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
    }
}