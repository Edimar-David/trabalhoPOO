package atividades;

import java.util.Scanner;

public class Ativide11 {

    public Ativide11(Scanner scan) {

        System.out.println("Digite seu nome: ");
        String name = scan.nextLine();

        System.out.println("Digite seu salário atual: ");
        double salary = scan.nextDouble();

        System.out.println("Digite a quantos anos está na empresa: ");
        int yearsAtTheCompany = scan.nextInt();

        if (yearsAtTheCompany <= 3){
            double newSalary = salary + (salary * 0.03);
            System.out.println("Seu novo salário é: " + newSalary);

        } else if (yearsAtTheCompany < 10) {
            double newSalary = salary + (salary * 0.125);
            System.out.println("Seu novo salário é: " + newSalary);

        } else {
            double newSalary = salary + (salary * 0.2);
            System.out.println("Seu novo salário é: " + newSalary);
        }


    }
}
