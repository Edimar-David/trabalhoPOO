package atividades;

import java.util.Scanner;

public class Ativide7 {

    public Ativide7(Scanner scan) {

        System.out.println("digite o nome do cliente");
        String name = scan.nextLine();
        System.out.println("digite o sexo (M/F)");
        String sexo = scan.nextLine();
        System.out.println("digite o valor das compras");
        double price = scan.nextDouble();

        if(sexo.equalsIgnoreCase("M")){
            var finalPrice = price - (price * 0.08);
            System.out.println("valor final para ele " + finalPrice);
        }else if(sexo.equalsIgnoreCase("F")){

            var finalPrice = price - (price * 0.13);
            System.out.println("valor final para ela " + finalPrice);
        }else {
            System.out.println("sexo invalido");
        }

    }
}
