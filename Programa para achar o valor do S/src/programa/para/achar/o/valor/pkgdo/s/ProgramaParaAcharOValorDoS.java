package programa.para.achar.o.valor.pkgdo.s;

import java.util.Scanner;

public class ProgramaParaAcharOValorDoS {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int N,cont,cont2 = 1;
         double S = 0,D,D1;
         
         System.out.print("Informe o valor de N: ");
         N = input.nextInt();
         
         for(cont = 0;cont <= N;cont = cont + 1){
             cont2 = cont2 + 2;
             D = 1/(Math.pow(1, 3.0));
             D1 = 1/Math.pow(3, 3);
             S = D - D1;
         }
         System.out.println(S);
         
         
    }
    
}
