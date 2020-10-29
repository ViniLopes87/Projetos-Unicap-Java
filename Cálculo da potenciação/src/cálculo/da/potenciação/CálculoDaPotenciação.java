package cálculo.da.potenciação;

import java.util.Scanner;

public class CálculoDaPotenciação {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int X,Y;
         double R;
         
         System.out.print("Informe o número da base: ");
         X = input.nextInt();
         System.out.print("Informe o expoente: ");
         Y = input.nextInt();
         
         while(Y < 0){
             System.out.println("Valor inválido");
             System.out.print("Informe o expoente que seja maior que 0: ");
             Y = input.nextInt();
         }
         
         if(Y == 0){
             R = 1;
         }
         
         else if(Y == 1){
             R = X;
         }
         
         else{
             R = Math.pow(X, Y);
         }
         
         System.out.println("O resultado de " + X + " elevado à " + Y + " é igual a " + R);
    }    
}