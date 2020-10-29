package programa.para.calcular.o.mdc.de.dois.números.funçao.recursividade;

import java.util.Scanner;

public class ProgramaParaCalcularOMDCDeDoisNúmerosFunçaoRecursividade {
    public static int MDC(int a,int b){
        int aux;
        if(a > b){
            aux = MDC(a - b,b);
        }
        else if(b > a){
            aux = MDC(b - a,a);
        }
        else{
            aux = a;
        }
        return aux;
    }
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int X,Y,MDC;
             
             System.out.print("Informe o valor de X: ");
             X = input.nextInt();
             System.out.print("Informe o valor de Y: ");
             Y = input.nextInt();
             
             MDC = MDC(X,Y);
             System.out.println("O MDC de " + X + " e de " + Y + " é igual a " + MDC);
        }
}