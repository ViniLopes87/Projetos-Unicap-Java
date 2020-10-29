package multiplicação.de.dois.numeros.inteiros.usando.soma.recursividade;

import java.util.Scanner;

public class MultiplicaçãoDeDoisNumerosInteirosUsandoSomaRecursividade {
    public static int produto(int a,int b){
        int aux = 0;
        
        if(b > 0){    
            aux = a + produto(a,b - 1);
        }
        
        return aux;
    }
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int N1,N2,P;
             
             System.out.print("Informe o valor de N1: ");
             N1 = input.nextInt();
             
             while(N1 < 1){
                 System.out.println("Valor de N1 inválido");
                 System.out.print("Informe o valor de N1 que seja maior que 0: ");
                 N1 = input.nextInt();
             }
             
             System.out.print("Informe o valor de N2: ");
             N2 = input.nextInt();
             
             while(N2 < 1){
                 System.out.println("Valor de N2 inválido");
                 System.out.print("Informe o valor de N2 que seja maior que 0: ");
                 N2 = input.nextInt();
             }
             
             P = produto(N1,N2);
             System.out.println(P);
        }
}