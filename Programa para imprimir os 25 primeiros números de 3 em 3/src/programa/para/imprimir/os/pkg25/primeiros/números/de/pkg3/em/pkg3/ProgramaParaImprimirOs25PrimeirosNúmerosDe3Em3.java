package programa.para.imprimir.os.pkg25.primeiros.números.de.pkg3.em.pkg3;

import java.util.Scanner;

public class ProgramaParaImprimirOs25PrimeirosNúmerosDe3Em3 {
    public static void main(String[] args) {
        
         Scanner input =  new Scanner(System.in);
         int N = -2, cont = 0, Q = 0;
         
         while(cont == 0){
             N = N + 3;
             System.out.println(+ N);
             Q = Q + 1;
        
        if(Q == 25){
           cont = 1; 
        }
         }
    }
    
}
