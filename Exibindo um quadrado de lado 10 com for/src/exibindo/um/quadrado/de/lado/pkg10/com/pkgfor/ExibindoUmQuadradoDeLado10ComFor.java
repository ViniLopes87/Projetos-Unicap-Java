package exibindo.um.quadrado.de.lado.pkg10.com.pkgfor;

import java.util.Scanner;

public class ExibindoUmQuadradoDeLado10ComFor {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int cont,N;
         
         for(cont = 0;cont != 10;cont = cont + 1){
             for(N = 0;N != 10;N = N + 1){
                 System.out.print("*" + " ");
             }
             System.out.println("");
         }
    }
}