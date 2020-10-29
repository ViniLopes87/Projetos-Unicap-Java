package triângulo.e.seus.tipos.com.repetição.funcao;

import java.util.Scanner;

public class TriânguloESeusTiposComRepetiçãoFuncao {
    public static boolean T(double a,double b, double c){
        if(a < b + c && b < a + c && c < a + b){
            return true;
        }
        else{
            return false;
        }
    }
      public static int QF(double a,double b,double c){
          int aux;
          if(a != b && a != c && b != c){
              aux = 1;
          }
          else if(a == b && b == c){
              aux = 3;
          }
          else{
              aux = 2;
          }
          return aux;
      }
      
        public static void main(String[] args) {
         
             Scanner input = new Scanner(System.in);
             double L1,L2,L3;
             int tipo;
             boolean TRI;
             char resp;
           
            do{
             System.out.print("Insira o valor do 1º lado: ");
             L1 = input.nextDouble();
             
             while(L1 <= 0){
                 System.out.println("Valor inválido");
                 System.out.print("Insira o valor do 1º lado que seja maior que 0: ");
                 L1 = input.nextDouble();
             }
             
             System.out.print("Insira o valor do 2º lado: ");
             L2 = input.nextDouble();
             
             while(L2 <= 0){
                 System.out.println("Valor inválido");
                 System.out.print("Insira o valor do 2º lado que seja maior que 0: ");
                 L2 = input.nextDouble();
             }
             
             System.out.print("Insira o valor do 3º lado: ");
             L3 = input.nextDouble();
             
             while(L3 <= 0){
                 System.out.println("Valor inválido");
                 System.out.print("Insira o valor do 3º lado que seja maior que 0: ");
                 L3 = input.nextDouble();
             }
             
             TRI = T(L1,L2,L3);
             tipo = QF(L1,L2,L3);
           
             if(TRI == true && tipo == 1){
               System.out.println("É um triângulo escaleno");
             }
             else if(TRI == true && tipo == 2){
                 System.out.println("É um triângulo isóscele");
             }
             else if(TRI == true && tipo == 3){
                 System.out.println("É um triângulo equilátero");
             }
             else{
                  System.out.println("Não é um triângulo");
             }
             
                System.out.print("Deseja fazer uma nova consulta utilize S ou N: ");
                resp = input.next().charAt(0);
               
                while(resp != 'S' && resp != 'N'){
                   System.out.println("Resposta inválida");
                   System.out.print("Deseja fazer uma nova consulta utilize S ou N: ");
                   resp = input.next().charAt(0);
                }
             
            }while(resp != 'N');
        }
}