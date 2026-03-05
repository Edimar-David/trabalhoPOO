package atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ativide3 {

    public Ativide3(Scanner scan) {
        List<Integer> score =  new ArrayList<>();

        System.out.println("digite seu nome:");
        String name = scan.nextLine();

        for (int i = 1; i <= 2; i++) {
            System.out.println("digite a nota " + i + ": ");
            score.add(scan.nextInt());
            scan.nextLine();
        }

        double media = (score.get(0) + score.get(1))/2;
        System.out.println("sua media é de " + media);


    }
}
