package informe.um.n.que.mostre.os.numeros.crescentes.recursividade;

import java.util.Scanner;

public class InformeUmNQueMostreOsNumerosCrescentesRecursividade {
    public static void crescente(int a){
        if(a > 0){
            crescente(a - 1);
            System.out.println(a);   
        }
    }
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int N;
             
             System.out.print("Informe o valor de N: ");
             N = input.nextInt();
             crescente(N);
        }   
}