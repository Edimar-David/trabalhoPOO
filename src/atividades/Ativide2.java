package atividades;

import java.util.Scanner;

public class Ativide2 {

    public Ativide2(Scanner scan) {

        System.out.println("qual seu ano de nascimento?");
        int year = scan.nextInt();
        int age = 2026 - year;

        if(age >= 18){
            System.out.println("vc pode votar");
        }else{
            System.out.println("vc não pode votar ainda ");
        }

    }
}
