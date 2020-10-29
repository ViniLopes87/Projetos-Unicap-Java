package cálculo.da.conta.vencida;

import java.util.Scanner;

public class CálculoDaContaVencida {
   public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       double VA,VM,QD,VJ,VN;
       System.out.print("Informe o valor da conta antiga:");
       VA = input.nextDouble();
       System.out.print("Informe o valor da multa:");
       VM = input.nextDouble();
       System.out.print("Informe o valor dos juros:");
       VJ = input.nextDouble();
       System.out.print("Informe a quantidade de dias de atraso:");
       QD = input.nextDouble();
       
       VN = VA + VM * QD + (VA * VJ * QD/100);
       
       System.out.print("Valor da multa por " + QD);
       System.out.println(" dias de atraso é = " + VM);
       System.out.print ("Valor dos juros a ser pago por " + QD);
       System.out.println(" dias de atraso é = " + VJ);
       System.out.println("Valor da nova conta = " + VN);
    }
    
}
