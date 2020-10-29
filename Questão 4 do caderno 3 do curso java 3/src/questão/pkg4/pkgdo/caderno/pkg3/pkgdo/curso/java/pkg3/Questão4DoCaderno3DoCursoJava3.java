package questão.pkg4.pkgdo.caderno.pkg3.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão4DoCaderno3DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][]mat = new char [10][10];
        char[]Vet = new char[10];
        int[]VetA = new int[10];
        int L,C,cont,acertou;
        
        for(cont = 0;cont < Vet.length;cont++){
            System.out.print("Informe o gabarito da " + (cont+1) + "ª questão da prova: ");
            Vet[cont] = input.next().charAt(0);
        }
        
        for(L = 0;L < mat.length;L++){
            for(C = 0;C < mat.length;C++){
                System.out.print("Candidato " + (L+1) + " informe a resposta da " + (C+1) + "ª questão da prova: ");
                mat[L][C] = input.next().charAt(0);
            }
        }
        
        for(L = 0;L < mat.length;L++){
            acertou = 0;
            for(C = 0;C < mat.length;C++){
                if(Vet[C] == mat[L][C]){
                   acertou++; 
                }
            }
            VetA[L] = acertou;
        }
        
        for(cont = 0;cont < VetA.length;cont++){
            System.out.println("O candidato " + (cont+1) + " acertou " + VetA[cont] + " questões");
        }
    }   
}