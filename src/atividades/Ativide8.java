package atividades;

import java.util.Scanner;

public class Ativide8 {

    public Ativide8(Scanner scan) {
        System.out.print("Digite a distância da viagem em Km: ");
        double distancia = scan.nextDouble();

        if (distancia <= 0) {
            System.out.println("Distância inválida.");
            return;
        }

        double precoPorKm;

        if (distancia <= 200) {
            precoPorKm = 0.50;
        } else {
            precoPorKm = 0.45;
        }

        double valorTotal = distancia * precoPorKm;

        System.out.println("Distância:" + distancia);
        System.out.println("Preço por Km: R$" + precoPorKm);
        System.out.println("Valor total da passagem: R$" + valorTotal);



    }
}
