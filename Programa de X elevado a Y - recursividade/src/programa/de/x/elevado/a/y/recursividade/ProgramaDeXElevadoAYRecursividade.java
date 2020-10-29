package programa.de.x.elevado.a.y.recursividade;

import java.util.Scanner;

public class ProgramaDeXElevadoAYRecursividade {
    public static double elevado(double a,int b){
        double aux;
        if(b == 0){
            return 1;
        }
        else if(b == 1){
            return a;
        }
        else{
          aux = a * elevado(a,b - 1);
          return aux;
        }
    }
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int Y;
             double X,P;
             
             System.out.print("Informe o valor da base da potenciação: ");
             X = input.nextDouble();
             System.out.print("Informe o valor do expoente: ");
             Y = input.nextInt();
             
             while(Y < 0){
                 System.out.println("Valor do expoente inválido");
                 System.out.print("Informe o valor do expoente que seja maior ou igual a 0: ");
                 Y = input.nextInt();
             }
             
             P = elevado(X,Y);
             System.out.println(P);
        }   
}