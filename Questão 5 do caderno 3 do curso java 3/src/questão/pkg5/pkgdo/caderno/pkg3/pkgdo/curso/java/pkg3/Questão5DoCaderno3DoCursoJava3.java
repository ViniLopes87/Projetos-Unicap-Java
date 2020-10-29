package questão.pkg5.pkgdo.caderno.pkg3.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão5DoCaderno3DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][]mat = new double[15][5];
        String[]Vet = new String[15];
        double media;
        int L,C,cont;
        
        for(cont = 0;cont < Vet.length;cont++){
            System.out.print("Informe o nome do " + (cont+1) + "º aluno: ");
            Vet[cont] = input.nextLine();
        }
        
        for(L = 0;L < 15;L++){
            for(C = 0;C < 5;C++){
                System.out.print("Informe a nota da " + (C+1) + "ª prova do aluno " + Vet[L] + ": ");
                mat[L][C] = input.nextDouble();
            }
        }
        
        for(L = 0;L < 15;L++){
            media = 0;
            for(C = 0;C < 5;C++){
                media = media + mat[L][C];
            }
            media = media/5;
            
            if(media >= 7){
                System.out.println("O aluno " + Vet[L] + " obteve média igual a " + media + " e foi aprovado");
            }
            else if(media < 2){
                System.out.println("O aluno " + Vet[L] + " obteve média igual a " + media + " e foi reprovado");
            }
            else{
                System.out.println("O aluno " + Vet[L] + " obteve média igual a " + media + " e está em exame final");
            }
        }
    }   
}