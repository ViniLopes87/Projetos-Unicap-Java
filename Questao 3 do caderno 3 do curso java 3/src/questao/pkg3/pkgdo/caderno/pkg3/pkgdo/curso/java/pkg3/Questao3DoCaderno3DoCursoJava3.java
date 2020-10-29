package questao.pkg3.pkgdo.caderno.pkg3.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questao3DoCaderno3DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][]mat = new int [5][5];
        int L,C,C1 = mat.length - 1;
        double media = 0;
        
        for(L = 0;L < 5;L++){
            for(C = 0;C < 5;C++){
                System.out.print("Informe o valor da posição [" + (L+1) + "] [" + (C+1) + "]: ");
                mat[L][C] = input.nextInt();
            }
        }
        
        for(L = 0;L < 5;L++){
            media = media + mat[L][C1];
            C1--;
        }
        
        media = media/5;
        System.out.println("A média dos valores da diagonal principal é de " + media);

    }
}