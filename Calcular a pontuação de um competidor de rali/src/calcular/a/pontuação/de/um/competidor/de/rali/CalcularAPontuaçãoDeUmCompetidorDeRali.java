package calcular.a.pontuação.de.um.competidor.de.rali;

import java.util.Scanner;

public class CalcularAPontuaçãoDeUmCompetidorDeRali {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double D,V,TG,P;
        System.out.print("Informe o valor da distância:");
        D = input.nextDouble();
        System.out.print("Informe o valor da velocidade:");
        V = input.nextDouble();
        System.out.print("Informe o valor do tempo gasto:");
        TG = input.nextDouble();
        
        P = (TG * 3600) - (D/V) * 3600;
       
        if (P > 0){
            System.out.println("Pontuação = " + (P * (-1)));
        }
        else{
            System.out.println("Pontuação = " + (P * 2));
        }
        
    }
    
}
