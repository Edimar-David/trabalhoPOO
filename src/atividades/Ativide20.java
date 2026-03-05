package atividades;

import java.util.Scanner;

public class Ativide20 {

    public Ativide20(Scanner scan) {
        int sum = 0;

        for (int i = 100; i >= 0 ; i -= 50) {
            sum += i;
        }
        System.out.println(sum);


    }
}
