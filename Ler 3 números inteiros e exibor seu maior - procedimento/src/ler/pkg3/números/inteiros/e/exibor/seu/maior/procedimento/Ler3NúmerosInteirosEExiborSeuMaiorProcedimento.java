package ler.pkg3.números.inteiros.e.exibor.seu.maior.procedimento;

import java.util.Scanner;

public class Ler3NúmerosInteirosEExiborSeuMaiorProcedimento {
    public static void maiorN(int a,int b,int c){
       int aux;
       if(a >= b && a >= c){
           System.out.println("O maior número é o " + a);
       }
       else if(b >= a && b >= c){
           System.out.println("O maior número é o " + b);
       }
       else{
           System.out.println("O maior número é o " + c);
       }
         if(a <= b && a <= c){
             System.out.println("O menor número é o " + a);
         }
         else if(b <= a && b <= c){
             System.out.println("O menor número é o " + b);
         }
         else{
             System.out.println("O menor número é o " + c);
         }
       
    }    
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int N1,N2,N3;
           System.out.print("Informe o 1º número que seja maior que 0: ");
           N1 = input.nextInt();
           
           while(N1 < 0){
               System.out.println("Número invalido");
               System.out.print("Informe o 1º número que seja maior que 0: ");
               N1 = input.nextInt();
           }
           
           System.out.print("Informe o 2º número que seja maior que 0: ");
           N2 = input.nextInt();
           
           while(N2 < 0){
               System.out.println("Número invalido");
               System.out.print("Informe o 2º número que seja maior que 0: ");
               N2 = input.nextInt();
           }
           
           System.out.print("Informe o 3º número que seja maior que 0: ");
           N3 = input.nextInt();
           maiorN(N1,N2,N3);
           
           while(N3 < 0){
               System.out.println("Número invalido");
               System.out.print("Informe o 3º número que seja maior que 0: ");
               N3 = input.nextInt();
           }          
       }   
}