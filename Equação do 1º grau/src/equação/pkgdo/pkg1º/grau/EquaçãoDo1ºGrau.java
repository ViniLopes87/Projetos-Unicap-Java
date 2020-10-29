package equação.pkgdo.pkg1º.grau;

import java.util.Scanner;

public class EquaçãoDo1ºGrau {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double A,B,X;
        System.out.print("Informe o valor de A: ");
        A = input.nextDouble();
        System.out.print("Informe o valor de B: ");
        B = input.nextDouble();
        
        X = -B/A;
        
    if(A != 0){
        System.out.println("O resultado da equação é " + X);
        }
    else {
        System.out.println("Não se pode resolver a equação");
    }
    }
    
}
