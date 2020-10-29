package teste.pkg1;

/* @author VINICIUS
 */

import java.util.Scanner;
public class Teste1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double N1,N2,Media;
        System.out.print("informe o valor de N1:");
          N1 = input.nextDouble();
        System.out.print("informe o valor de N2:");
          N2 = input.nextDouble();
          
          Media = (N1 + N2)/2;
          
          System.out.println("media = " + Media);
             
    }
    
}
