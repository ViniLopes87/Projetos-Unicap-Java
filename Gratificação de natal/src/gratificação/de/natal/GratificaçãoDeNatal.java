package gratificação.de.natal;

import java.util.Scanner;

public class GratificaçãoDeNatal {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         double T,HE,HF;
         System.out.print("Informe a quantidade de horas extras: ");
         HE = input.nextDouble();
         System.out.print("Informe a quantidade de horas que faltou: ");
         HF = input.nextDouble();
         
         T = (HE - (2/3 * HF));
    if(T > 40){
        System.out.println("O funcionário receberá R$200,00 de gratificação");        
    }
    else if(T > 30 && T <= 40){
        System.out.println("O funcionário receberá R$175,00 de gratificação");
    }
    else if(T > 20 && T <= 30){
        System.out.println("O funcionário receberá R$150,00 de gratificação");
    }
    else if(T > 10 && T <= 20){
        System.out.println("O funcionário receberá R$125,00 de gratificação");
    }
    else if(T <=10){
        System.out.println("O funcionário receberá R$100,00 de gratificação");
    }
       }    
}
