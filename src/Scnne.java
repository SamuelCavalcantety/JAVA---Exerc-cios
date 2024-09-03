

// ENTRADA DE DADO (SCANNER) e if e else //

import java.util.Scanner;

public class Scnne {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
         System.out.print("Digite o seu nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        int idade = 2024 - anoNascimento;
        String maioridade = "";
        if (idade <18)
            maioridade = "menor";
        else
            maioridade = "maior";
        System.out.println("Olá,"  +nome+  " você possui "  + idade + " anos e é " + maioridade + " de idade ");
    }
}