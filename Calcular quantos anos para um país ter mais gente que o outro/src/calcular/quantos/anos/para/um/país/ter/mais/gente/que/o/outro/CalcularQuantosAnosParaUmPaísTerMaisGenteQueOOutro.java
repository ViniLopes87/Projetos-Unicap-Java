package calcular.quantos.anos.para.um.país.ter.mais.gente.que.o.outro;

import java.util.Scanner;

public class CalcularQuantosAnosParaUmPaísTerMaisGenteQueOOutro {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         double PA,PB,TXA,TXB;
         int contAnos = 0;
         
         System.out.print("Informe a quantidade de pessoas que existem no país A: ");
         PA = input.nextDouble();
         System.out.print("Informe a taxa de natalidade do país A: ");
         TXA = input.nextDouble();
         System.out.print("Informe a quantidade de pessoas que existem no país B: ");
         PB = input.nextDouble();
         System.out.print("Informe a taxa de natalidade do país B: ");
         TXB = input.nextDouble();
         
         do{
            contAnos = contAnos + 1;
            PA = PA + ((TXA/100) * PA);
            PB = PB + ((TXB/100) * PB);
         }while(PA <= PB);
         System.out.println("Serão necessários " + contAnos + " anos para o país A ter mais gente que o B");
    }   
}