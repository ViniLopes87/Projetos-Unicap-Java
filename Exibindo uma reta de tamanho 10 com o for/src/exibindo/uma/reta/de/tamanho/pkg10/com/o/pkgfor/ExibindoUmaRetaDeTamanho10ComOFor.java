package exibindo.uma.reta.de.tamanho.pkg10.com.o.pkgfor;

import java.util.Scanner;

public class ExibindoUmaRetaDeTamanho10ComOFor {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int cont;
         
         for(cont = 0;cont != 10;cont = cont + 1){
             System.out.print('*' + " ");
         }
         System.out.println("");
    }   
}