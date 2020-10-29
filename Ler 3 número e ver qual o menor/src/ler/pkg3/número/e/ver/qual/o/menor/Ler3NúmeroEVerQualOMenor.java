package ler.pkg3.número.e.ver.qual.o.menor;

import java.util.Scanner;

public class Ler3NúmeroEVerQualOMenor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double N1,N2,N3;
        System.out.print("Informe o N1: ");
        N1 =input.nextDouble();
        
        System.out.print("Informe o N2: ");
        N2 = input.nextDouble();
        
        System.out.print("Informe o N3: ");
        N3 = input.nextDouble();

    if( N1 <= N2 && N1 <= N3){
        System.out.println("O menor número é: " + N1);
    }
    else if(N2 <= N1 && N2 <= N3){
        System.out.println("O menor número é: " + N2);
    }
    else{
        System.out.println("O menor número é: " + N3);
    }
    }
    
}
