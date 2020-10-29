package programa.da.pirâmide.recursividade;

import java.util.Scanner;

public class ProgramaDaPirâmideRecursividade {
    public static void piramide(int a){
        int L = a,N = 1;
        if(a > 0){
            linha(L,N);
            System.out.println(" ");
            piramide(a - 1); 
        }
    }
        public static void linha(int b,int c){
            if(b > 0){
                System.out.print(c + " ");
                linha(b - 1,c + 1);
            }
        }
            public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
                 int N;
                 
                 System.out.print("Informe o número de linhas: ");
                 N = input.nextInt();
                 
                 while(N <= 0){
                     System.out.println("Número inválido");
                     System.out.print("Informe o número de linhas que seja maior que 0: ");
                     N = input.nextInt();
                 }
                 
                 piramide(N);
            }    
}