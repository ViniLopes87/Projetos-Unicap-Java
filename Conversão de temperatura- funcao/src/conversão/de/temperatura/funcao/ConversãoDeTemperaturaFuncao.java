package conversão.de.temperatura.funcao;

import java.util.Scanner;

public class ConversãoDeTemperaturaFuncao {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         double F,C,FC,CF;
         int OP,cont = 1;
         
         while(cont != 0){
         System.out.println("Escolha uma opção");
         System.out.println("0 - Para sair");
         System.out.println("1 - Converter para Celsius");
         System.out.println("2 - Converter para Fahrenheit");
         System.out.print("Opção: ");
         OP = input.nextInt();
         
         while(OP != 0 && OP != 1 && OP != 2){
             System.out.println("Opção inválida");
             System.out.print("Diga a opção com 0 ou 1 ou 2: ");
             OP = input.nextInt();
         }
         
         if(OP == 1){
             System.out.print("Digite a temperatura em Fahrenheit: ");
             F = input.nextDouble();
             FC = Fahrenheit(F);
             System.out.println(F + " graus em Fahrenheit é " + FC + " graus em Celsius");
         }
         
         else if(OP == 0){
             cont = 0;
         }
         
         else{
             System.out.print("Digite a temperatura em Celsius: ");
             C = input.nextDouble();
             CF = Celsius(C);
             System.out.println(C + "  graus em Celsius é " + CF + " graus em Fahrenheit");
         }
         
         }
         
    }
    
        public static double Fahrenheit(double a){
            double aux;
            aux = (a - 32)/1.8;
            return aux;
        }
        
          public static double Celsius(double a){
              double aux1;
              aux1 = a * 1.8 + 32;
              return aux1;
          }    
}