package calcular.a.gratificação.em.uma.empresa;

import java.util.Scanner;

public class CalcularAGratificaçãoEmUmaEmpresa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double TS,SF,G;
        System.out.print("Informe o salário do funcionário: ");
        SF = input.nextDouble();
        System.out.print("Informe o tempo de serviço: ");
        TS = input.nextDouble();
        
    if(TS >= 10){
        G = SF * 0.2;
        System.out.println("O valor da gratificação = " + G);
       }
    else{
        G = SF * 0.1;
        System.out.println("O valor da gratificção = " + G);
       }
    }
    
}
