package programa.de.raiz.pkgdo.pkg2º.grau.procedimento;

import java.util.Scanner;

public class ProgramaDeRaizDo2ºGrauProcedimento {
    public static void raiz(double a,double b,double c){
        double D,X;
        D = Math.pow(b,2) - 4 * a * c;
        if(D < 0){
            System.out.println("Não existem raízes reais");
        }
        else if(D == 0){
            X = (-b + Math.sqrt(D))/(2 * a);
            System.out.println("A raiz da equação é " + X);
        }
        else{
            X = (-b + Math.sqrt(D))/(2 * a);
            System.out.println("A 1º raiz da equação é " + X);
            X = (-b - Math.sqrt(D))/(2 * a);
            System.out.println("A 2º raiz da equação é " + X);
        }
    }
          public static void menu(){
              System.out.println("Escolha uma opção:");
              System.out.println("0 - Para sair");
              System.out.println("1 - Para calcular");
          }
              public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);
                  double a,b,c;
                  int OP;
                do{
                  menu();
                  System.out.print("Opção: ");
                  OP = input.nextInt();
                  switch(OP){
                      case 0: break;
                      case 1: System.out.print("Informe o valor de A: ");
                              a = input.nextDouble();
                              System.out.print("Informe o valor de B: ");
                              b = input.nextDouble();
                              System.out.print("Informe o valor de C: ");
                              c = input.nextDouble();
                              raiz(a,b,c);
                              break;
                      default: System.out.println("Opção inválida");
                               break;
                  }
                }while(OP != 0);
              }
}