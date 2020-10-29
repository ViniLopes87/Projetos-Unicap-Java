package valor.a.ser.pago.pelo.produto.de.acordo.com.o.preço.e.a.quantidade;

import java.util.Scanner;

public class ValorASerPagoPeloProdutoDeAcordoComOPreçoEAQuantidade {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int CP,QC;
         double PU,VT,VD,VF;
         
         System.out.println("1 a 10 o preço unitário é R$ 9,50");
         System.out.println("11 a 20 o preço unitário é R$ 13,25");
         System.out.println("21 a 30 o preço unitário é R$ 24,10");
         System.out.println("31 a 40 o preço unitário é R$ 37,75");
         System.out.print("Informe o código do produto: ");
         CP = input.nextInt();
         
         while(CP < 1 || CP > 40){
             System.out.println("Código invalido");
             System.out.println("1 a 10 o preço unitário é R$ 9,50");
             System.out.println("11 a 20 o preço unitário é R$ 13,25");
             System.out.println("21 a 30 o preço unitário é R$ 24,10");
             System.out.println("31 a 40 o preço unitário é R$ 37,75");
             System.out.print("Informe o código do produto: ");
             CP = input.nextInt();
         }
         
         System.out.print("Informe a quantidade do produto comprado: ");
         QC = input.nextInt();
         
         while(QC <= 0){
             System.out.println("Quantidade inválida: ");
             System.out.print("Informe a quantidade do produto comprado: ");
             QC = input.nextInt();
         }
         
         if(CP <= 10){
             PU = 9.50; 
         }
         
         else if(CP <= 20){
             PU = 13.25;
         }
         
         else if(CP <= 30){
             PU = 24.10;
         }
         
         else{
             PU = 37.75;
         }
         
           VT = QC * PU;
           
           if(VT <= 150){
               VD = VT * 0.025;
           }
           
           else if(VT <= 300){
               VD = VT * 0.05;
           }
           
           else{
               VD = VT * 0.1;
           }
           
           VF = VT - VD;
           
           System.out.println("O preço unitário é de " + PU);
           System.out.println("O valor total da compra é de R$ " + VT);
           System.out.println("O valor do desconto é de R$ " + VD);
           System.out.println("O valor final a ser pago é de R$ " + VF);
    }
}