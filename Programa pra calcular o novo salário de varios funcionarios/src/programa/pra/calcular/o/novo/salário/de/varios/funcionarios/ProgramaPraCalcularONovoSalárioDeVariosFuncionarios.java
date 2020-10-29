package programa.pra.calcular.o.novo.salário.de.varios.funcionarios;

import java.util.Scanner;

public class ProgramaPraCalcularONovoSalárioDeVariosFuncionarios {
    public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         double S,NS,A;
         int cont = 0;
         char resp;
     
    while(cont == 0){
          System.out.print("Informe o salário: ");
          S = input.nextDouble();
     
    while(S <= 880){
        System.out.println("Salário inválido");
        System.out.print("Informe o salário: ");
        S = input.nextDouble();
    }  
    
    if(S > 4000){
        A = S * 0.05;
        NS = A + S;
    }
    else if(S > 2500 && S <= 4000){
        A = S * 0.1;
        NS = A + S;
    }
    else if(S > 1500 && S <= 2500){
        A = S * 0.15;
        NS = A + S;
    }
    else{
        A = S * 0.2;
        NS = A + S; 
    }
    
       System.out.println("O funcionário terá aumento de R$ " + A + " e passará a receber R$ " + NS);
       System.out.print("Deseja fazer uma nova consulta? Digite S ou N: ");
       resp = input.next().charAt(0);
       
    while(resp != 'S' && resp != 'N'){
        System.out.println("Resposta inválida");
        System.out.print("Deseja fazer uma nova consulta? Digite S ou N: ");
        resp = input.next().charAt(0);
    }
    
    if(resp == 'N'){
        cont = 1;
    }
    
      }
    }
    
}