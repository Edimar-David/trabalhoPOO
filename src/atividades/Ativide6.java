package atividades;

import java.util.Scanner;

public class Ativide6 {

    public Ativide6(Scanner scan) {

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;

        if (idade < 18) {
            int anosFaltando = 18 - idade;
            System.out.println("Ainda não é hora do alistamento.");
            System.out.println("Faltam " + anosFaltando + " ano(s) para o alistamento.");
        } else if (idade == 18) {
            System.out.println("Está na hora de se alistar!");
        } else {
            int anosAtraso = idade - 18;
            System.out.println("Já passou do tempo de alistamento.");
            System.out.println("Passaram-se " + anosAtraso + " ano(s) do alistamento.");
        }

    }
}
