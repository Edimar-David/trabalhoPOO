package atividades;

import java.util.Scanner;

public class Ativide4 {

    public Ativide4(Scanner scan) {

        System.out.println("digite um numero:");
        int number = scan.nextInt();

        if (number % 2 == 0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }

    }
}
