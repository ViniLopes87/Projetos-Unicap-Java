package exibindo.um.quadrado.de.lado.n.com.pkgfor;

import java.util.Scanner;

public class ExibindoUmQuadradoDeLadoNComFor {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int cont,N,L;
         
         System.out.print("Informe o valor do lado do quadrado de 10 a 20: ");
         L = input.nextInt();
         
         while(L < 10 || L > 20){
             System.out.println("Valor inválido");
             System.out.print("Informe o valor do lado do quadrado de 10 a 20: ");
             L = input.nextInt();
         }
         
           for(cont = 0;cont != L;cont = cont + 1){
               for(N = 0;N != L;N = N + 1){
                   System.out.print("*" + " ");
               }
               System.out.println("");
           }
    }
}