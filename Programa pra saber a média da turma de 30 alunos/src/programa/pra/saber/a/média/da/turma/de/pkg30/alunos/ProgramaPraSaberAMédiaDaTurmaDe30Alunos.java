package programa.pra.saber.a.média.da.turma.de.pkg30.alunos;

import java.util.Scanner;

public class ProgramaPraSaberAMédiaDaTurmaDe30Alunos {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double N1,N2,NT,PQP,PQR,PQN,M,soma = 0;
        int cont = 0, QP = 0, QN = 0, QR = 0;
                 
    while(cont != 30){
        cont = cont + 1;
        
        System.out.print("Informe a 1ª nota da parcial que é entre 0 a 10: ");
        N1 = input.nextDouble();
        System.out.print("Informe a 2ª nota da parcial que é entre 0 a 10: ");
        N2 = input.nextDouble();
             
        while(N1 < 0 || N1 > 10 || N2 < 0 || N2 > 10 ){
        
        System.out.println("Dados inválidos");
        System.out.print("Informe a 1ª nota da parcial que é entre 0 a 10: ");
        N1 = input.nextDouble();
        System.out.print("Informe a 2ª nota da parcial que é entre 0 a 10: ");
        N2 = input.nextDouble();
    }
        NT = (N1 + N2)/2;
        soma = soma + NT;
        
    if(NT >= 7){
        System.out.println("O aluno obteve média " + NT + " e está aprovado");
        QP = QP + 1;
    }
    else if(NT >= 3){
        System.out.println("O aluno obteve média " + NT + " e está em recuperação");
        QR = QR + 1;
    }
    else{
        System.out.println("O aluno obteve média " + NT + " e está em reprovado");
        QN = QN + 1;
    }
    }
    M = soma/cont;
    PQP = (QP * 100)/cont;
    PQR = (QR * 100)/cont;
    PQN = (QN * 100)/cont;
    
    System.out.println("A quantidade de alunos aprovados foi " + QP + " e de alunos em recuperação foi " + QR + " e de alunos que reprovou foi " + QN);
    System.out.println("O percentual de quem passou foi " + PQP + "% e de quem foi pra recuperação foi " + PQR + "% e de quem reprovou foi " + PQN + "%");
    System.out.println("A média da turma é " + M);
    }
    
}
