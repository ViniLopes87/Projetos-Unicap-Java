package nota.pkgdo.aluno.com.uma.média.aritmética;

import java.util.Scanner;

public class NotaDoAlunoComUmaMédiaAritmética {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double N1,N2,NT;
        int cont = 0;
                 
    while(cont != 30){
        cont = cont + 1;
        
        System.out.print("Informe a 1ª nota da parcial que é entre 0 a 10: ");
        N1 = input.nextDouble();
        System.out.print("Informe a 2ª nota da parcial que é entre 0 a 10: ");
        N2 = input.nextDouble();
    NT = (N1 + N2)/2;
    if(NT >= 7){
        System.out.println("O aluno obteve média " + NT + " e está aprovado");
    }
    else if(NT >= 3){
        System.out.println("O aluno obteve média " + NT + " e está em recuperação");
    }
    else{
        System.out.println("O aluno obteve média " + NT + " e está em reprovado");
    }
    }
  }
}
    
