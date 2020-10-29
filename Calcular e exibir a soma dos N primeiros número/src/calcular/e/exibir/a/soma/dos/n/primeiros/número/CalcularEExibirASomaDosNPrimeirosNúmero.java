package calcular.e.exibir.a.soma.dos.n.primeiros.número;

import java.util.Scanner;

public class CalcularEExibirASomaDosNPrimeirosNúmero {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int N,S = 0,V,cont;
         
         System.out.print("Informe a quantiade de números a serem somados que seja maior que zero: ");
         N = input.nextInt();
         
         while(N <= 0){
             System.out.println("Quantidade inválida");
             System.out.print("Informe a quantidade de números a serem somados que seja maior que 0: ");
             N = input.nextInt();
         }
         
         for(cont = 0;cont != N;cont = cont + 1){
             System.out.print("Informe o valor: ");
             V = input.nextInt();
             
             S = S + V;
             
             System.out.println(S);
         }
    }
}