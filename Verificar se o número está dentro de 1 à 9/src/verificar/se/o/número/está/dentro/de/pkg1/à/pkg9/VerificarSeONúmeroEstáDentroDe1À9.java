package verificar.se.o.número.está.dentro.de.pkg1.à.pkg9;

import java.util.Scanner;

public class VerificarSeONúmeroEstáDentroDe1À9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double N1;
        System.out.print("Informe um número entre 1 e 9: ");
        N1 = input.nextDouble();

    if( N1 >= 1 && N1 <= 9){
       System.out.println("O valor está dentro da faixa permitida");
    }
     else{
       System.out.println("O valor não está dentro da faixa permitida");
    }
     
    }
    
}
