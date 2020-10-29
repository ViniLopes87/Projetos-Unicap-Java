package data.mês.e.ano.funcao;

import java.util.Scanner;

public class DataMêsEAnoFuncao {
    public static boolean VA(int a){
        if(a >= 1900 && a <= 3000){
            return true;
        }
        else{
            return false;
        }
    }
       public static boolean VM(int a){
           if(a >= 1 && a <= 12){
               return true;
           }
           else{
               return false;
           }
       }
         public static boolean VD(int a){
             if(a >= 1 && a <= 31){
                 return true;
             }
             else{
                 return false;
             }
         }
           public static boolean B(int a){
             if(a % 400 == 0 || a % 4 == 0 && a % 100 != 0){
                 return true;
             }
             else{
                 return false;
             }
           }
              public static void main(String[] args) {
               
                 Scanner input = new Scanner(System.in);
                 int D,M,A;
                 boolean V1,V2,V3,VB;
                 char resp;
                 
                  do{
                  System.out.print("Digite um valor pro dia: ");
                  D = input.nextInt();
                  System.out.print("Digite um valor pro mês: ");
                  M = input.nextInt();
                  System.out.print("Digite um valor pro ano: ");
                  A = input.nextInt();
                
                  V1 = VA(A);
                  V2 = VM(M);
                  V3 = VD(D);
                  VB = B(A);
                
                 if(V1 == true && V2 == true && V3 == true){
                     System.out.print("A data é " + D + "/" + M + "/" + A);
                 }
                 else{
                     System.out.println("A data está inválida");
                 }
                   if(VB == true){
                       System.out.println(" e é um ano bissexto");
                   }
                   else{
                       System.out.println(" e não é um ano bissexto");
                   }
                   
                      System.out.print("Deseja fazer uma nova consulta: ");
                      resp = input.next().charAt(0);
                      
                      while(resp != 'S' && resp != 'N'){
                          System.out.println("Resposta inválida");
                          System.out.print("Deseja fazer uma nova consulta utilize S ou N: ");
                          resp = input.next().charAt(0);
                      }
                   
                 }while(resp != 'N');
              }   
}