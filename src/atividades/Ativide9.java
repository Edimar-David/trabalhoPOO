package atividades;

import java.util.Scanner;

public class Ativide9 {

    int number1;
    int number2;
    int number3;


    public Ativide9(Scanner scan) {

        System.out.println("digite o primeiro lado");
        this.number1 = scan.nextInt();
        System.out.println("digite o segundo lado");
        this.number2 = scan.nextInt();
        System.out.println("digite o terceiro lado");
        this.number3 = scan.nextInt();

        if(isEquilateral()){
            System.out.println("triangulo equilatero");
        } else if (isIsoceles()) {
            System.out.println("triangulo isoceles");
        }else {
            System.out.println("triangulo escaleno");
        }

    }

    public Boolean isEquilateral(){
        if(this.number1 == this.number2 && this.number1 == this.number3){
            return true;
        }
        return false;

    }
    public Boolean isIsoceles(){
        if(this.number1 == this.number2 || this.number1 == this.number3 || this.number2 == this.number3){
            return true;
        }
        return false;

    }
}
