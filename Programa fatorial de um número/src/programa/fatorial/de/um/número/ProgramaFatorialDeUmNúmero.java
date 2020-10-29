package programa.fatorial.de.um.número;

import java.util.Scanner;

public class ProgramaFatorialDeUmNúmero {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int N, F = 1,num; 
         
         System.out.print("Inforem o número: ");
         N = input.nextInt();
         num = N;
         
        if(N < 0){
             System.out.println("Não exixtes fatorial de número negativo");
        }
        
        else if(N == 0 || N == 1){
             F = 1;
             System.out.println("O fatorial de " + num + " é " + F);
        }
        
        else{   
             while(N >= 1){
              F = N * F;
              N = N - 1;
             } 
            System.out.println("O fatorial de " + num + " é " + F);
        }
    }
}