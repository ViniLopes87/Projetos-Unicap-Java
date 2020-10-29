package salário.de.um.funcionario.e.sua.profissão.funcao;

import java.util.Scanner;

public class SalárioDeUmFuncionarioESuaProfissãoFuncao {
    public static double coeficiente(char a){
        double aux;
        switch (a) {
            case 'M': aux = 0.1; 
                      break;
            case 'V': aux = 0.15;
                      break;
            default: aux = 0.2;         
                     break;
        }
        return aux;
    }
       public static double Sbruto(double a,int b,double c){
           double aux1;
           aux1 = a + b * c;
           return aux1;
       }
          public static double imposto(char a,double b){
              double aux2;
              if(a == 'O' && b >= 300){
                  aux2 = 0.05;
              }
              else if(a == 'O' && b < 300){
                  aux2 = 0.03;
              }
              else if(a == 'G' && b >= 400){
                  aux2 = 0.06;
              }
              else{
                  aux2 = 0.04;
              }
              return aux2;
          }
             public static int gratificacao(int a,char b){
                 int aux3;
                 if(b == 'N' && a > 80){
                     aux3 = 50;
                 }
                 else{
                     aux3 = 30;
                 }
                 return aux3;
             }
                public static double auxilio(char a,double b,double c){
                    double aux4;
                    if(a == 'O' || b <= 25){
                        aux4 = (1/3) * c;
                    }
                    else{
                        aux4 = 0.5 * c;
                    }
                    return aux4;
                }
                   public static double Sliquido(double a,double b,double c){
                       double aux5;
                       aux5 = a + c - b;
                       return aux5;
                   }
                      public static int classe(double a){
                          int aux6;
                          if(a > 1000){
                              aux6 = 3;
                          }
                          else if(a >= 500){
                              aux6 = 2;
                          }
                          else{
                              aux6 = 1;
                          }
                          return aux6;
                      }
                          public static void main(String[] args) {
                              Scanner input = new Scanner(System.in);
                              double S,SB,SL,CS,I,A;
                              int HT,G,C;
                              char T,P,resp;
                              
                              do{
                              System.out.print("Informe seu salário base: ");
                              S = input.nextDouble();
                              
                              while(S <= 0){
                                  System.out.println("Salário inválido");
                                  System.out.print("Informe seu salário base: ");
                                  S = input.nextDouble();
                              }
                              
                              System.out.print("Informe seu turno de trabalho utilizando M,V ou N: ");
                              T = input.next().charAt(0);
                              
                              while(T != 'M' && T != 'V' && T != 'N'){
                                  System.out.println("Turno inválido");
                                  System.out.print("Informe seu turno de trabalho utilizando M,V ou N: ");
                                  T = input.next().charAt(0);
                              }
                              
                              System.out.print("Informe sua profissão utilizando O ou G: ");
                              P = input.next().charAt(0);
                              
                              while(P != 'O' && P != 'G'){
                                  System.out.println("Profissão inválida");
                                  System.out.print("Informe sua profissão utilizando O ou G: ");
                                  P = input.next().charAt(0);
                              }
                              
                              System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
                              HT = input.nextInt();
                              
                              while(HT <= 0){
                                  System.out.println("Quantidade de horas inválidas");
                                  System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
                                  HT = input.nextInt();
                              }
                              
                              CS = coeficiente(T);
                              SB = Sbruto(S,HT,CS);
                              I = imposto(P,SB);
                              G = gratificacao(HT,T);
                              A = auxilio(P,CS,SB);
                              SL = Sliquido(SB,I,A);
                              C = classe(SL);
                              
                              switch (C){
                                  case 1: System.out.println("A classificação da pessoa é mal remunerado");
                                          break;
                                  case 2: System.out.println("A classificação da pessoa é normal");
                                          break;
                                  case 3: System.out.println("A classificação da pessoa é bem remunerado");
                                          break;
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