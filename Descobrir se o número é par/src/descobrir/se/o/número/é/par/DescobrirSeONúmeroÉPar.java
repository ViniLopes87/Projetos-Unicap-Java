package descobrir.se.o.número.é.par;

import java.util.Scanner;

public class DescobrirSeONúmeroÉPar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int X;
        System.out.print("Informe o número inteiro: ");
        X = input.nextInt();
               
    if (X % 2 == 0){
        System.out.println("O número " + X + " é par");
    }
    else{
        System.out.println("O número " + X + " é ímpar");
    }
    }
  }
