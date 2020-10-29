package crédito.pessoal.de.um.banco.funcao;

import java.util.Scanner;

public class CréditoPessoalDeUmBancoFuncao {
    
    public static double credito(double a,double b){
        double aux;
        aux = a * (b/100);
        return aux;
    }
      public static void main(String[] args) {
        
          Scanner input = new Scanner(System.in);
          double S,C;
          int B;
          char resp;
          
          do{
          System.out.print("Informe o saldo médio: ");
          S = input.nextDouble();
          
             while(S <= 0){
                 System.out.println("Não terá direito ao benefício");
             }
          
          if(S > 400){
              B = 30;
          }
          
          else if(S > 300){
              B = 25;
          }
          
          else if(S > 200){
              B = 20;
          }
          
          else{
              B = 10;
          }
          
          C = credito(S,B);
          System.out.println("Para um saldo médio igual a R$ " + S + ", será dado um crédito de R$ " + C);
          System.out.print("Deseja fazer um novo cálculo S ou N: ");
          resp = input.next().charAt(0);
          
                while(resp != 'S' && resp != 'N'){
                    System.out.println("Resposta inválida");
                    System.out.println("Deseja fazer um novo cálculo S ou N: ");
                    resp = input.next().charAt(0);
                }
          
          }while(resp != 'N');
      }  
}