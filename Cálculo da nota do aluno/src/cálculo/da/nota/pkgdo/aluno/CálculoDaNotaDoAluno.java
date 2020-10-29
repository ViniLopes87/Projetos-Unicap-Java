package cálculo.da.nota.pkgdo.aluno;

import java.util.Scanner;

public class CálculoDaNotaDoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double N1,N2,N3,NF;
        System.out.print("Informe o valor da nota 1:");
        N1 = input.nextDouble();
        System.out.print("Informe o valor da nota 2:");
        N2 = input.nextDouble();
        System.out.print("Informe o valor da nota 3:");
        N3  = input.nextDouble();
        
        NF = N1 * 0.3 + N2 * 0.2 + N3 * 0.5;
        
        System.out.println("Nota final =" + NF);
    }
    
}
