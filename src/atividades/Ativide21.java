package atividades;

import java.util.Scanner;

public class Ativide21 {

    public Ativide21(Scanner scan) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;

        for (int i = 1; i <= 7 ; i++) {
            System.out.println("Digite uma nota: ");
            double sumNotes = scan.nextDouble();

            sum += sumNotes;
        }
        System.out.println(sum);

    }
}
