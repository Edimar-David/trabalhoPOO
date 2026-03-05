package atividades;

import java.util.Scanner;

public class Ativide10 {

    public Ativide10(Scanner scan) {
        System.out.println("Digite a largura do terreno: ");
        double landWidth = scan.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        double landLength = scan.nextDouble();

        double area = landLength * landWidth;

        if (area < 100) System.out.println("Terreno Popular.");

        else if (area >= 100 && area <= 500) System.out.println("Terreno Master");

        else if (area > 500) System.out.println("Terreno VIP");


    }
}
