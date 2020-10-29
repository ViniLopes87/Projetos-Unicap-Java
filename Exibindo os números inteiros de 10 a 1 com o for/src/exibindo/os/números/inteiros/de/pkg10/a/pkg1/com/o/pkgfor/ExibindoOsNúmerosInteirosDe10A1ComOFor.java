package exibindo.os.números.inteiros.de.pkg10.a.pkg1.com.o.pkgfor;

import java.util.Scanner;

public class ExibindoOsNúmerosInteirosDe10A1ComOFor {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int cont;
         
         for(cont = 10;cont >= 1;cont = cont - 1){
             System.out.print(cont + " ");
         }
             System.out.println("");
    }  
}