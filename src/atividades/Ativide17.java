package atividades;

import java.util.Scanner;

public class Ativide17 {

    public Ativide17(Scanner scan) {
        System.out.println("Digite o número que deseja iniciar a contagem: ");
        int startNumber = scan.nextInt();

        System.out.println("Digite o numero que deseja encerrar a contagem: ");
        int endNumber = scan.nextInt();

        System.out.println("Digite o número do incremento: ");
        int increment = scan.nextInt();


        System.out.println("Cuidado com suas escolhas.... Qualquer erro de calculo o seu pc ja era.");

        if (startNumber < endNumber){
            for (int i = startNumber; i <= endNumber ; i -= increment) {
                System.out.println(i);
            }
        }else {
            for (int i = startNumber; i <= endNumber; i += increment) {
                System.out.println(i);
            }
        }
        System.out.println("Acabou!");


    }
}
