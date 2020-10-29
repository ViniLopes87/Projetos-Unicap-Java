package calcular.média.pkgdo.aluno.no.fim.pkgdo.ano;

import java.util.Scanner;

public class CalcularMédiaDoAlunoNoFimDoAno {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double N1,N2,NF;
        System.out.print("Informe a nota 1: ");
        N1 = input.nextDouble();
        System.out.print("Informe a nota 2: ");
        N2 = input.nextDouble();
        
        NF = (N1 + N2)/2;
    if(NF >= 7){
        System.out.println("O aluno obteve média " + NF + " e está aprovado");
        }
    else if (NF >= 3){
        System.out.println("O aluno obteve média " + NF + " e está na final");   
        }
    else {
        System.out.println("O aluno obteve média " + NF + " e está reprovado");        
        }
    }    
}
