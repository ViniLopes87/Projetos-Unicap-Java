package programa.para.imprimir.com.um.incremento.recursividade;

import java.util.Scanner;

public class ProgramaParaImprimirComUmIncrementoRecursividade {
    public static void serie(int a,int b,int c){
        if(a < b){
            System.out.println(a);
            serie(a + c,b,c);
        }
    }
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int c,f,v;
             
             System.out.print("Informe o número do começo: ");
             c = input.nextInt();
             
             while(c < 1){
                 System.out.println("Começo inválido");
                 System.out.print("Informe o número do começo que seja maior ou igual a 1: ");
                 c = input.nextInt();
             }
             
             System.out.print("Informe o número do fim: ");
             f = input.nextInt();
             
             while(f < 1){
                 System.out.println("Fim inválido");
                 System.out.print("Informe o número do fim que seja maior ou igual a 1: ");
                 f = input.nextInt();
             }
             
             System.out.print("Informe a variação: ");
             v = input.nextInt();
             
             while(v < 1){
                 System.out.println("Variação inválida");
                 System.out.print("Informe a variação que seja maior ou igual a 1: ");
                 v = input.nextInt();
             }
             
             serie(c,f,v);
        }  
}