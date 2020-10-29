package questão.pkg1.pkgdo.caderno.pkg3.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão1DoCaderno3DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][]mat = new int[6][4];
        int[]Vet = new int[6];
        int L,C;
        
        for(L = 0;L < 6;L++){
            for(C = 0;C < 4;C++){
                System.out.print("Informe o valor da posição [" + (L+1) + "] [" + (C+1) + "]: ");
                mat[L][C] = input.nextInt();
            }
        }
        
        for(L = 0;L < 6;L++){
            Vet[L] = 0;
            for(C = 0;C < 4;C++){
                if(mat[L][C] > Vet[L]){
                    Vet[L] = mat[L][C];
                }
            }
        }
        
        for(L = 0;L < 6;L++){
            for(C = 0;C < 4;C++){
                mat[L][C] = mat[L][C] * Vet[L];
            }
        }
        
        System.out.println("A matriz resultante é:");
        for(L = 0;L < 6;L++){
            for(C = 0;C < 4;C++){
                System.out.print(mat[L][C] + " ");
            }
            System.out.println();
        }
    }   
}