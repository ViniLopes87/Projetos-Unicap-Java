package conersão.de.dólar.em.real.funçao;

import java.util.Scanner;

public class ConersãoDeDólarEmRealFunçao {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         double R,D,RD,DR,C = 2.53384;
         int OP,cont = 1;
         
         while(cont != 0){
         System.out.println("Escolha uma opção:");
         System.out.println("0 - Para sair");
         System.out.println("1 - Converter em real");
         System.out.println("2 - Converter em dólar");
         System.out.print("Opção: ");
         OP = input.nextInt();
         
         while(OP != 0 && OP != 1 && OP != 2){
             System.out.println("Opção inválida");
             System.out.print("Digite sua opção com 0 ou 1 ou 2: ");
             OP = input.nextInt();
         }
         
         if(OP == 1){
            System.out.print("Digite o valor em real: ");
            R = input.nextDouble();
            RD = real(R,C);
            System.out.println("O valor de " + R + " reais em dólar é de " + RD + " dólares");
         }
         
         else if(OP ==0){
             cont = 0;
         }
         
         else{
            System.out.print("Digite o valor em dólar: ");
            D = input.nextDouble();
            DR = dolar(D,C);
            System.out.println("O valor de " + D + " dólares em reais é de " + DR + " reais");
         }
         
         }
        
    }
    
        public static double real(double a,double b){
            double aux;
            aux = a / b;
            return aux;
        }
        
          public static double dolar(double a,double b){
              double aux1;
              aux1 = a * b;
              return aux1;
          }
}