package quantos.anos.para.que.um.seja.maior.que.o.outro;

import java.util.Scanner;

public class QuantosAnosParaQueUmSejaMaiorQueOOutro {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int A1,QC1,A2,QC2,contAnos = 0,cont2;
         
         System.out.print("Informe a altura de Pedro: ");
         A1 = input.nextInt();
         System.out.print("Informe quanto cresçe Pedro por ano: ");
         QC1 = input.nextInt();
         System.out.print("Informe a altura de Lucas: ");
         A2 = input.nextInt();
         System.out.print("Informe quanto cresçe Lucas por ano: ");
         QC2 = input.nextInt();
         
         do{
             contAnos = contAnos + 1;
             A1 = A1 + QC1;
             A2 = A2 + QC2;
         }while(A1 >= A2);
         
         System.out.println("Serão necessários " + contAnos + " anos para Lucas ser maior que Pedro");
    }   
}