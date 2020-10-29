package quantidade.de.água.que.cabe.em.uma.caixa;

import java.util. Scanner;

public class QuantidadeDeÁguaQueCabeEmUmaCaixa {
    public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
       double D,H,V,QA;
       System.out.print("Informe o valor do diâmetro:");
       D = input.nextDouble();
       System.out.print("Informe o valor da altura:");
       H = input.nextDouble();
       
       V = 3.14 * (Math.pow(D/2,2.0)) * H;
       QA = V * 1000000;
       
       System.out.println("Quantidade de água =" + QA);
       
    }
    
}
