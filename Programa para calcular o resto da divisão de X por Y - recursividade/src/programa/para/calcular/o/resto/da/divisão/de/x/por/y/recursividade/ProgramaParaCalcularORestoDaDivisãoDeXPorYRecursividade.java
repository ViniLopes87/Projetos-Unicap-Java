package programa.para.calcular.o.resto.da.divisão.de.x.por.y.recursividade;

import java.util.Scanner;

public class ProgramaParaCalcularORestoDaDivisãoDeXPorYRecursividade {
    public static int resto(int a,int b){
        int aux;
        if(a == b){
            aux = 0;
        }
        else if(a > b){
            aux = resto(a - b,b);   
        }
        else{
            aux = a;
        }
        return aux;
    }
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int X,Y,R;
             
             System.out.print("Informe o valor do dividendo: ");
             X = input.nextInt();
             
             while(X <= 0){
                 System.out.println("Valor inválido");
                 System.out.print("Informe o valor do dividendo que seja maior que 0: ");
                 X = input.nextInt();
             }
             
             System.out.print("Informe o valor do divisor: ");
             Y = input.nextInt();
             
             while(Y <= 0){
                 System.out.println("Valor inválido");
                 System.out.print("Informe o valor do divisor que seja maior que 0: ");
                 Y = input.nextInt();
             }
             
             R = resto(X,Y);
             System.out.println("O resto é igual a " + R);
        }   
}