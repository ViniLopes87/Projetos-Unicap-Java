package série.de.fibonacci.procedimento;

import java.util.Scanner;

public class SérieDeFibonacciProcedimento {
    public static void calcular(int a){
        int cont,anterior = 1,atual = 0,proximo = 0;
        for(cont = 0;cont < a;cont = cont + 1){
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
            System.out.println(+ proximo);
        }
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int N;
            
            System.out.print("Informe o valor de N maior que 1: ");
            N = input.nextInt();
            
            while(N <= 1){
                System.out.println("Valor de N inválido");
                System.out.print("informe o valor de N maior que 1: ");
                N = input.nextInt();
            }
            
            calcular(N);
        }
}