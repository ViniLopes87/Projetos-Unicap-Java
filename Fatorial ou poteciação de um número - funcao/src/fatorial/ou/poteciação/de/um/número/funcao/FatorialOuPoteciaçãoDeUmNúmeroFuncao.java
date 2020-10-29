package fatorial.ou.poteciação.de.um.número.funcao;

import java.util.Scanner;

public class FatorialOuPoteciaçãoDeUmNúmeroFuncao {

    public static int Fatorial(int a){
        int aux = 1;
    
        while(a >= 1){
        aux = a * aux;
        a = a - 1;
        }
        return aux;
    }
       public static int Potencia(int a,int b){
           int aux = 1;
           
           while(b != 0){
           aux = a * a;
           b = b - 1;
           }
           return aux;
       }
          public static void main(String[] args) {
             
              Scanner input = new Scanner(System.in);
              int OP,F,P,N,E;
              
              do{
              System.out.println("Escolha uma opção");
              System.out.println("0 - Para sair do programa");
              System.out.println("1 - Fatorial de um número");
              System.out.println("2 - Potência de um número");
              System.out.print("Opção: ");
              OP = input.nextInt();
              
              switch(OP){
                  case 0: break;
                  
                  case 1: System.out.print("Insira um número inteiro maior ou igual a zero: ");
                          N = input.nextInt();
                          if(N >= 0){
                          F = Fatorial(N);
                          System.out.println("O fatorial de " + N + " é " + F);
                          }
                          else{
                              System.out.println("Não existe fatorial de número negativo");
                          }
                          break;
                  case 2: System.out.print("Insira o número inteiro maior ou igua a zero para ser a base a potência: ");
                          N = input.nextInt();
                          System.out.print("Insira o número do expoente da potência: ");
                          E = input.nextInt();
                          
                          while(E < 0){
                              System.out.println("Valor do expoente inválido");
                              System.out.print("Insira o número do expoente da potência que seja maior ou igual a zero: ");
                              E = input.nextInt();
                          }
                          
                          P = Potencia(N,E);
                          System.out.println(N + " elevado à " + E + " é igual a " + P);
                          break;
                  default: System.out.println("Opção inválida");                          
              }
              }while(OP != 0);
          }   
}