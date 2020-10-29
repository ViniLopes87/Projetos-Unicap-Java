package ler.pkg3.número.e.ordenar.eles.de.menor.pro.maior.procedimento;

import java.util.Scanner;

public class Ler3NúmeroEOrdenarElesDeMenorProMaiorProcedimento {
    public static void ordenar(double a,double b,double c){
        if(a > b){                                                // a>b
            if(b > c){                                            // a>b>c
                System.out.println(c + " ; " + b + " ; " + a);
            }
            else if (a > c){                                      // a>c>=b
                System.out.println(b + " ; " + c + " ; " + a);
            }
            else{                                                 // c>=a>b
                System.out.println(b + " ; " + a + " ; " + c);
            }
        }
        else if(b > c){                                           // b>=a
            if(a > c){                                            // b>=a>c
                System.out.println(c + " ; " + a + " ; " + b);
            }
            else{                                                 // b>c>=a
                System.out.println(a + " ; " + c + " ; " + b);
            }
        }
        else{                                                     // c>=b>=a
            System.out.println(a + " ; " + b + " ; " + c);
        }
    }
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             double N1,N2,N3;
             
             System.out.print("Informe o valor de N1: ");
             N1 = input.nextDouble();
             System.out.print("Informe o valor de N2: ");
             N2 = input.nextDouble();
             System.out.print("Informe o valor de N3: ");
             N3 = input.nextDouble();
             ordenar(N1,N2,N3);
        }    
}