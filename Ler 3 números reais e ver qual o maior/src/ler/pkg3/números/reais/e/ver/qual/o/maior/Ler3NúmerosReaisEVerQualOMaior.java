package ler.pkg3.números.reais.e.ver.qual.o.maior;

import java.util.Scanner;

public class Ler3NúmerosReaisEVerQualOMaior {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double N1,N2,N3;
        System.out.print("Informe o N1: ");
        N1 =input.nextDouble();
        
        System.out.print("Informe o N2: ");
        N2 = input.nextDouble();
        
        System.out.print("Informe o N3: ");
        N3 = input.nextDouble();

    if( N1 == N2 || N2 == N3){
        System.out.println("Os número são iguais e o programa não pode prosseguir"); 
    }
    else if( N1 > N2 && N1 > N3){
        System.out.println("O maior número é: " + N1);
    }
    else if(N2 > N1 && N2 > N3){
        System.out.println("O maior número é: " + N2);
    }
    else{
        System.out.println("O maior número é: " + N3);
    }
    }
    
}
