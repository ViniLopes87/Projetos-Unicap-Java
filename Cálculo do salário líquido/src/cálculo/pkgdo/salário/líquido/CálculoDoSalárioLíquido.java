package cálculo.pkgdo.salário.líquido;

import java.util.Scanner;

public class CálculoDoSalárioLíquido {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        double VSM,NH,ND,QHE,SL;
        System.out.print("Informe o valor do salário mínimo:");
        VSM = input.nextDouble();
        System.out.print("Informe o número de horas trabalhadas:");
        NH = input.nextDouble();
        System.out.print("Informe o número de dependentes:");
        ND = input.nextDouble();
        System.out.print("Informe a quantidade de horas extras trabalhadas:");
        QHE = input.nextDouble();
        
        SL = (NH * 1/10 * VSM + 5 * VSM/100 + 1.5 * 1/10 * VSM * QHE) * 0.90;
        
        System.out.println("Valor do salário líquido =" + SL);
    }
    
}
