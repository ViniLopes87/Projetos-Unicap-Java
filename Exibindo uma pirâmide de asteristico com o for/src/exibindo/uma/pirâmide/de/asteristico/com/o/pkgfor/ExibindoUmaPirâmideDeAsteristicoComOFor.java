package exibindo.uma.pirâmide.de.asteristico.com.o.pkgfor;

import java.util.Scanner;

public class ExibindoUmaPirâmideDeAsteristicoComOFor {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int cont,N,L;
         char c = '*';
         
         System.out.print("Informe o N de 10 a 20: ");
         L = input.nextInt();
         
         for(cont = 1;cont <= L;cont = cont + 1){
             for(N = 1;N <= cont;N = N + 1){
                 
                 System.out.print(c + "");
             }
             System.out.println("");
         }
    }
}