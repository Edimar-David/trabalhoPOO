package atividades;

import java.util.Scanner;

public class Ativide1 {

    public Ativide1(Scanner scan) {
        System.out.println("qual a velocidade do carro?");
        var spd = scan.nextDouble();

        if (spd > 80) {
            System.out.println("vc foi multado");
            spd -= 80;
            double multa = spd * 5;
            System.out.println("valor : R$" + multa);


        }
    }
}
