package quantidade.de.litros.gasto;

import java.util.Scanner;

public class QuantidadeDeLitrosGasto {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       double LG,V,T,QL;
       System.out.print("Informe o valor da Velociade:");
         V = input.nextDouble();
       System.out.print("Informe o valor de Tempo gasto:");
         T = input.nextDouble();
       System.out.print("Informe o valor de Quilometragem por litro:");
         QL = input.nextDouble();
         
          LG = (V * T)/ QL ;
       
       System.out.println("Total de combustível gasto =" + LG);
    }
    
}
