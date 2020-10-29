package calcular.a.quantidade.de.latas.de.tinta.e.o.dinheiro.a.ser.gasto;

import java.util.Scanner;

public class CalcularAQuantidadeDeLatasDeTintaEODinheiroASerGasto {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        double H,D,QT,AT,DG,QLG;
        System.out.print("Informe o valor da altura:");
        H = input.nextDouble();
        System.out.print("Informe o valor do diâmetro:");
        D = input.nextDouble();
        System.out.print("Informe o valor da quantidade de tanques:");
        QT = input.nextDouble();
        
        AT = (3.14 * (Math.pow(D/2,2.0)) * 2 + 2 * 3.14 * H) * QT;
        QLG = Math.ceil (AT/15);
        DG = 45 * QLG;
        
        System.out.println("Quantidade de latas =" + QLG);
        System.out.println("Dinheiro gasto =" + DG);
    }
    
}
