package solicitar.um.número.e.calcular.sua.tabuada;

import java.util.Scanner;

public class SolicitarUmNúmeroECalcularSuaTabuada {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int N,cont,T;
         
         System.out.print("Informe o número: ");
         N = input.nextInt();
         System.out.println("Tabuada de " + N + ":");
         
         while(N < 1 || N > 10){
             System.out.println("Número invalido");
             System.out.print("Informe o número de 1 a 10: ");
             N = input.nextInt();
         }
         
         for(cont = 0;cont != 11;cont = cont + 1){
             T = N * cont;
             System.out.println(T);
         }
    }  
}