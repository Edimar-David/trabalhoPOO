package atividades;

import java.util.Scanner;

public class Ativide16 {

    public Ativide16(Scanner scan) {
        for (int i = 30; i >= 1 ; i--) {
            System.out.println(i);
            if (i % 4 == 0){
                System.out.println("[" + i + "]");
            }
        }
        System.out.println("Acabou");



    }
}
