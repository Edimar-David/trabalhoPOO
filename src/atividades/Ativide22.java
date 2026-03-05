package atividades;

import java.util.Scanner;

public class Ativide22 {

    public Ativide22(Scanner scan) {

        int sum = 0;

        System.out.println("Digite o termo da PA: ");
        int term = scan.nextInt();

        System.out.println("Digite a razão da PA: ");
        int reason = scan.nextInt();

        for (int i = term; i <= term * 10; i += reason) {
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
