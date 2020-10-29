package aumento.pkgdo.salário.pkgdo.jogador;

import java.util.Scanner;

public class AumentoDoSalárioDoJogador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double S, NS,A;
        System.out.print("Informe seu salário: ");
        S = input.nextDouble();
    
    if(S <= 1900){
        A = S * 0.2;
        NS = S + A;
    }
    else if(S <= 3300){
        A = S * 0.15;
        NS = S + A;
    }
    else if(S <= 5800){
        A = S * 0.1;
        NS = S + A;
    }
    else{
        A = S * 0.05;
        NS = S + A;
    }
    System.out.println("O jogador terá aumento de R$ " + A + " e passará a receber R$ " + NS);
    }
}
