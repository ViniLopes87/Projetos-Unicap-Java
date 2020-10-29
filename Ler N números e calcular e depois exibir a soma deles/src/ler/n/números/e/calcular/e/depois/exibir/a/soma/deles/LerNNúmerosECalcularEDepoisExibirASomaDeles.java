package ler.n.números.e.calcular.e.depois.exibir.a.soma.deles;

import java.util.Scanner;

public class LerNNúmerosECalcularEDepoisExibirASomaDeles {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int N,V,cont,S = 0;
         
         System.out.print("Informe a quantiade de números a serem somados que seja maior que zero: ");
         N = input.nextInt();
         
         while(N <= 0){
             System.out.println("Quantidade inválida");
             System.out.print("Informe a quantiade de números a serem somados que seja maior que zero: ");
             N = input.nextInt();
         }
            
            for(cont = 0;cont != N;cont = cont + 1){
                System.out.print("Informe o valor: ");
                V = input.nextInt();
                
                S = S + V;
            }
                System.out.println("O resultado da soma é " + S);
    }
}