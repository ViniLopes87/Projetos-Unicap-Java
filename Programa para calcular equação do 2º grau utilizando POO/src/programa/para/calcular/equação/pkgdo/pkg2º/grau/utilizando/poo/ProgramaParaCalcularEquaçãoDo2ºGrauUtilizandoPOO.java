package programa.para.calcular.equação.pkgdo.pkg2º.grau.utilizando.poo;

import java.util.Scanner;

public class ProgramaParaCalcularEquaçãoDo2ºGrauUtilizandoPOO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        Raizes R;
        
        System.out.print("Informe o valor de A: ");
        a = input.nextDouble();
        System.out.print("Informe o valor de B: ");
        b = input.nextDouble();
        System.out.print("Informe o valor de C: ");
        c = input.nextDouble();
        
        R = new Raizes(a,b,c);
        double x1 = R.raiz1();
        double x2 = R.raiz2();
        
        System.out.println("A solução para x1 é " + x1);
        System.out.println("A solução para x2 é " + x2);
    }   
}