package pirâmide.de.letra;

import java.util.Scanner;

public class PirâmideDeLetra {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int N,cont,i;
         char c = 'A';
         
         System.out.print("Informe o número de 1 a 26: ");
         N = input.nextInt();
         
         while(N < 1 || N > 26){
             System.out.println("Número inválido");
             System.out.print("Informe o número de 1 a 26: ");
             N = input.nextInt();
         }
         
         for(cont = 1;cont != N + 1;cont = cont + 1){
               for(i = 1;i <= cont; i = i + 1){
                   System.out.print(c + " ");
               }
                  System.out.println("");
                  c++;
         }
    }   
}