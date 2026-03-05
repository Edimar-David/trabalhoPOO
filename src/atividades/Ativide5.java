package atividades;

import java.util.Scanner;

public class Ativide5 {

    public Ativide5(Scanner scan) {

        System.out.println("digite um ano:");
        int year = scan.nextInt();

        if(year % 4 == 0){
            System.out.println("ano bissexto");
        }else{
            System.out.println("ano normal");
        }

    }
}
