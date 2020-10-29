package calcular.as.coordenadas.de.um.retângulo;

import java.util.Scanner;

public class CalcularAsCoordenadasDeUmRetângulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double L,H,X1,Y1,X2,Y2,X3,Y3,X4,Y4;
        System.out.print("Informe o valor da largura:");
        L = input.nextDouble();
        System.out.print("Informe o valor da altura:");
        H = input.nextDouble();
        System.out.print("Informe o valor de X1:");
        X1 = input.nextDouble();
        System.out.print("Informe o valor de Y1:");
        Y1 = input.nextDouble();
        
        Y2 = Y1;   
        X2 = X1 + L;
        Y3 = Y1 - H;
        X3 = X1 + L;
        Y4 = Y1 - H;
        X4 = X1;
        
        System.out.println("X2 =" + X2);
        System.out.println("Y2 =" + Y2);
        System.out.println("X3 =" + X3);
        System.out.println("Y3 =" + Y3);
        System.out.println("X4 =" + X4);
        System.out.println("Y4 =" + Y4);
    }
    
}
