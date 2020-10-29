package preço.pkgdo.objeto.com.desconto;

import java.util.Scanner;

public class PreçoDoObjetoComDesconto {
   public static void main(String[] args) {
   
       Scanner input = new Scanner(System.in);
       double PR,D,PF,QE;
       System.out.print("Informe o valor do preço real:");
         PR = input.nextDouble();
       System.out.print("Informe o valor do desconto:");
         D = input.nextDouble();
         
         PF = PR - (PR * D/100);
         QE = PR * D/100;
         
       System.out.println("Preço real do produto =" + PR);
       System.out.println("Preço final =" + PF);
       System.out.println("Valor economizado =" + QE);
    }
    
}
